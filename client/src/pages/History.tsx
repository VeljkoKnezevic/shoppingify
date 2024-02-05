import { useQuery } from "@tanstack/react-query";
import LeftSidebar from "../components/leftSidebar";
import { TList } from "../types";
const History = () => {
  const getLists = async (): Promise<TList[]> => {
    const response = await fetch("http://localhost:8080/list/all", {
      method: "GET",
    });

    const json = await response.json();

    return json;
  };

  const { data } = useQuery({
    queryKey: ["list"],
    queryFn: getLists,
  });

  return (
    <div className="flex">
      <LeftSidebar />

      <main>
        <h1>Shopping history</h1>
        {data &&
          data.map((list) => {
            return <div key={list.id}>{list.name}</div>;
          })}
      </main>
    </div>
  );
};

export default History;
