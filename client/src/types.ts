export type TItems = {
  id: number;
  name: string;
  note?: string;
  category: TCategory;
};

export type TCategory = {
  id: number;
  name: string;
};

export type TList = {
  id: number;
  name: string;
  completed: boolean | null;
  items: TItems;
};

export type Table = "item" | "list";
