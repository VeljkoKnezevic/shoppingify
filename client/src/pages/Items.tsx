import { useQuery } from "@tanstack/react-query";
import LeftSidebar from "../components/leftSidebar";
import { useEffect } from "react";
import { TItems } from "../types";

const Items = () => {
  const getItems = async (): Promise<TItems[]> => {
    const response = await fetch("http://localhost:8080/item/all", {
      method: "GET",
    });

    const json = await response.json();

    return json;
  };

  const { data } = useQuery({
    queryKey: ["items"],
    queryFn: getItems,
  });

  useEffect(() => {
    console.log(data);
  }, [data]);

  return (
    <div className="flex">
      <LeftSidebar />
      <header>
        <h1>
          <span>Shoppingify</span> allows you to take your shopping list
          wherever you go
        </h1>

        <form>
          <input type="text" placeholder="search item" />
        </form>
      </header>

      <main>
        {data &&
          data.map((item) => {
            return <div key={item.id}>{item.name}</div>;
          })}
      </main>
    </div>
  );
};

export default Items;
