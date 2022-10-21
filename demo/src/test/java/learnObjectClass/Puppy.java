package learnObjectClass;

public class Puppy {
  private String name;
  private int puppyAge;

  private Puppy(String name) {
    System.out.println("小狗名字是 :" + name);
    this.name = name;
  }

  private int getPuppyAge() {
    return puppyAge;
  }

  private void setPuppyAge(int puppyAge) {
    this.puppyAge = puppyAge;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "Puppy{" +
        "name='" + name + '\'' +
        '}';
  }

  public static void main(String[] args) {
    Puppy puppy = new Puppy("tommy");
    puppy.setPuppyAge(10);
    puppy.setPuppyAge(11);
    System.out.println(puppy.getPuppyAge());
    System.out.println(puppy.name);

    PuppyFriend puppyFriend = new PuppyFriend("Judy");

    System.out.println("puppy's friend is " + puppyFriend.name);
  }
}

class PuppyFriend {
  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PuppyFriend(String name) {
    this.name = name;
  }
}
