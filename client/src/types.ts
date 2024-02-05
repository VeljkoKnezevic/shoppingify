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
