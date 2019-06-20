package com.kevin.designpattern.headfirst.factory.abstractfactory.factory;

import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.Pepperoni;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.cheese.Cheese;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.cheese.ReggianoCheese;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.clams.Clams;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.dough.Dough;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.sauce.MarinaraSauce;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.sauce.Sauce;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.veggies.Garlic;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.veggies.Mushroom;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.veggies.Veggies;

/**
 *   加州工厂生产本地的各种调料
 *
 * @author lihongmin
 * @date 2018/9/2 21:20
 */
public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createFough() {

        return new Dough();
    }

    @Override
    public Sauce createSauce() {

        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {

        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Mushroom()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {

        return new Pepperoni();
    }

    @Override
    public Clams createClams() {

        return new Clams();
    }

}
