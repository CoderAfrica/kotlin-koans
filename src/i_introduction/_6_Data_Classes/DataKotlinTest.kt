package i_introduction._6_Data_Classes

data class Person2(val name:String, val age:Int){
    override fun toString(): String {
        return name
    }

    fun customFun(){

    }
}