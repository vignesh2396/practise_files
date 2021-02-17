package com.skillsbuild;
class MySensitiveData{
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
class MalSubClass extends MySensitiveData implements Cloneable{

    protected MalSubClass(int data) {
        super(data);
    }
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

    public static void main(String[] args) {
        var mal1 = new MalSubClass(1234);
        var gdata = mal1.getData();
        System.out.println("data :" + gdata);
    }
}
