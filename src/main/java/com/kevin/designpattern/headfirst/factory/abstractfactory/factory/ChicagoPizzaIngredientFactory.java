package com.kevin.designpattern.headfirst.factory.abstractfactory.factory;

import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.dough.Dough;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.dough.ThinCrustDough;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.Pepperoni;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.cheese.Cheese;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.clams.Clams;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.clams.FreshClams;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.sauce.Sauce;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.veggies.*;

/**
 *   芝加哥工厂生产本地的各种调料
 *
 * @author lihongmin
 * @date 2018/9/2 21:20
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createFough() {

        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {

        return new Sauce();
    }

    @Override
    public Cheese createCheese() {

        return new Cheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Mushroom(), new Onion(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {

        return new Pepperoni();
    }

    @Override
    public Clams createClams() {

        return new FreshClams();
    }

}
