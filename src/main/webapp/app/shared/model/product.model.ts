import dayjs from 'dayjs';
import { ICategory } from 'app/shared/model/category.model';

export interface IProduct {
  id?: number;
  title?: string;
  keywords?: string | null;
  description?: string | null;
  rating?: number | null;
  dateAdded?: string | null;
  dateModified?: string | null;
  categories?: ICategory[] | null;
}

export const defaultValue: Readonly<IProduct> = {};
