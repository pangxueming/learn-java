package learnObjectClass;

public class InstanceCounter {
  private static int numInstances = 0;

  private static int getNumInstances() {
    return numInstances;
  }

  private static void addNumInstance() {
    numInstances++;
  }

  public static void main(String[] args) {
    System.out.println("Starting with " + InstanceCounter.getNumInstances() + " instance");
    for (int i = 0; i < 500; i++) {
      addNumInstance();
    }

    System.out.println("Created " + InstanceCounter.getNumInstances() + "instance");
  }
}
