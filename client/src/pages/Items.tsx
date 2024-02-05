/* eslint-disable @typescript-eslint/no-explicit-any */
import { useQuery } from "@tanstack/react-query";
import LeftSidebar from "../components/leftSidebar";
import { useEffect } from "react";
import { Table } from "../types";
import RightSidebar from "../components/rightSidebar";

type TItems = {
  queryFunction: (table: Table) => Promise<any>;
};

const Items = ({ queryFunction }: TItems) => {
  const { data } = useQuery({
    queryKey: ["items"],
    queryFn: queryFunction("item"),
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

      <RightSidebar />
    </div>
  );
};

export default Items;
