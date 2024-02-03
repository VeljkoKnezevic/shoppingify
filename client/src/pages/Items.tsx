import LeftSidebar from "../components/leftSidebar";

const Items = () => {
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
    </div>
  );
};

export default Items;
