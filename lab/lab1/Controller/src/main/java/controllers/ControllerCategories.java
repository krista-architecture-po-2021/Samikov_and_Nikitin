package controllers;

import BO.BisnesObjectCategory;
import DO.CategoryDo;
import Singleton.Singleton;
import modell.DAOCategory;
import modell.ModelFactory;

import java.util.ArrayList;

public class ControllerCategories implements InterfaceCategoryController {

    private Singleton singleton;

    private ArrayList<BisnesObjectCategory> bocategory;

    private ModelFactory modelFactory;

    public ControllerCategories(ModelFactory ModelF)
    {
        this.modelFactory=ModelFactory.getModel(1);
    }
    @Override
    public int categoryfindbyname(String name) {
       
       else  return -1;
    }

    @Override
    public ArrayList<BisnesObjectCategory> returnallcategories() {
        return model.getCategories();
    }

    /*@Override
    public void addcategory(BisnesObjectCategory category) {
        model.getCategories().add(category);
    }

    @Override
    public void categorychange(int catnum,String category) {
        model.getCategories().set(catnum,category);
    }

    @Override
    public void categorydelete(int catnum) {
        model.getCategories().remove(catnum);
    }*/

}

