package dip;

import model.Model;
import repository.Repository;

public class Main {
  public static void main(String args[]) {
    Model model = new Model();

    model.setId(1);
    model.setDescription("Descripción");

    Repository.save(model);

  }
}
