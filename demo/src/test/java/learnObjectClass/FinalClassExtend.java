package learnObjectClass;

public class FinalClassExtend {
  protected int num = 10;

  public final void changeNum() {
    this.num = 31;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }
}

class Child extends FinalClassExtend {
  // idea 报错
  //  public final void changeNum() {
  //
  //  }

  public static void main(String[] args) {
    Child child = new Child();
    child.getCurrNum();

    FinalClassExtend finalClassExtend = new FinalClassExtend();
    finalClassExtend.changeNum();
    System.out.println(finalClassExtend.num);
    finalClassExtend.setNum(10);
    System.out.println(finalClassExtend.num);
    finalClassExtend.setNum(20);
    System.out.println(finalClassExtend.num);

    System.out.println(child.num);

    child.getCurrNum();
    System.out.println(child.num);
    System.out.println(finalClassExtend.num);

    child.getCurrNum();
    System.out.println(child.num);
    System.out.println(finalClassExtend.num);
  }

  private void getCurrNum() {
    this.num++;
    System.out.println(this.num);
  }
}
