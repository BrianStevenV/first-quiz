package org.velezreyes.quiz.question6;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine, Drink{
  private static int quarter = 0;
  private String drinkName;
  private boolean fizzy;

  public VendingMachineImpl(String drinkName, boolean fizzy) {
    this.drinkName = drinkName;
    this.fizzy = fizzy;
  }

  public VendingMachineImpl() {}

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

  @Override
  public String getName() {
    return drinkName;
  }

  @Override
  public boolean isFizzy() {
    return fizzy;
  }

  @Override
  public void insertQuarter() {
    VendingMachineImpl.quarter += 25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {

    Map<String, Integer> drinks = new HashMap<>();
    drinks.put("ScottCola", 75);
    drinks.put("KarenTea", 100);

    if (!drinks.containsKey(name)) {
      throw new UnknownDrinkException();
    }

    if (VendingMachineImpl.quarter < drinks.get(name)) {
      throw new NotEnoughMoneyException();
    }

    VendingMachineImpl.quarter -= drinks.get(name);
    Drink drink = drinks.get(name) == 75 ? new VendingMachineImpl(name, true) : new VendingMachineImpl(name, false);
    return drink;
  }

}
