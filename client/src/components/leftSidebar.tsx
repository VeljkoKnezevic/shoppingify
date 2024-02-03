import { Link } from "react-router-dom";

const leftSidebar = () => {
  return (
    <aside className="flex h-screen w-1/12 max-w-24 flex-col items-center justify-between py-14">
      <img src="/logo.svg" alt="logo" />

      <div className="flex flex-col gap-12">
        <Link className="w-fit" to={"/"}>
          <img src="/list.svg" alt="Items page" />
        </Link>
        <Link className="w-fit" to={"/history"}>
          <img src="/undo.svg" alt="History page" />
        </Link>
      </div>

      <div className="w-100% w-fit rounded-full bg-yellow-500">
        <img src="/shopping_cart.svg" alt="Checkout" className="p-[11px]" />
      </div>
    </aside>
  );
};

export default leftSidebar;
