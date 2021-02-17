package com.skillsbuild;
/*class MySensitiveData{
    private static int sensitiveDate;

    MySensitiveData(int data){
        sensitiveDate = data;
    }
    final int getData(){
        return sensitiveDate;
    }
    final void replace(){
        sensitiveDate = 4321;
    }
}
class MalSubClass extends MySensitiveData implements Cloneable {

    protected MalSubClass(int data) {
        super(data);
    }

    //override clone
    @Override
    public MalSubClass clone() {
        MalSubClass malsub = null;
        try {
            malsub = (MalSubClass) super.clone();
        } catch (Exception e) {
            System.out.println("Instance not cloneable");
        }
        return malsub;
    }
}*/
    class CloneDefence{
        public static void main(String[] args) {
            var mal1 = new MalSubClass(1234);
            var mal2 = mal1.clone();



            var gdata1 = mal1.getData();
            var gdata2 = mal1.getData();

            System.out.println("data :" + gdata1);
            System.out.println("data :" + gdata2);

            mal2.replace();

            System.out.println("data :" + gdata1);
            System.out.println("data :" + gdata2);

        }
    }

