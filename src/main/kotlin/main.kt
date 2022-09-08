fun main() {

    var choice = 0
    var name: String
    var businessName: String
    var number: String
    println("Are you a residential or business customer?\n" +
            "(1) Residential\n" +
            "(2) Business")
    print("Enter a number: ")
    choice = readln()!!.toInt()

    if (choice == 1) {
        print("Enter your name: ")
        name = readln()!!.toString()
        print("Enter your phone number: ")
        number = readln()!!.toString()
        customer(name, number)
    }
    else if(choice == 2) {
        print("Enter your business name: ")
        businessName = readln()!!.toString()
        print("Enter your contact name: ")
        name = readln()!!.toString()
        print("Enter your phone number: ")
        number = readln()!!.toString()
        customer(businessName, name, number)
    }

}

fun customer(name: String, phoneNumber: String) {
    println("Hello residential customer. Your name is $name and " +
            "your phone number is $phoneNumber.")
}

fun customer(businessName: String, contactName: String, phoneNumber: String) {
    println("Hello residential customer. Your business name is $businessName, " +
            "your contact name is $contactName, and your phone number is $phoneNumber.")
}