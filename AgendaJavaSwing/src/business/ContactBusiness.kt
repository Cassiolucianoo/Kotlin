package business

import entity.ContactEntity
import repository.ContactRepository
import java.lang.Exception

class ContactBusiness {

   private fun validate(name: String, phone: String) {
        if (name == "") {
            throw Exception("Name is required")
        }
        if (phone == "") {
            throw Exception("Phone is required")
        }
    }

   private fun validateDelete(name: String, phone: String){
        if (name == "" || phone == ""){
            throw Exception("It is necessary to select a contact before removing")
        }
    }

    fun getContactCountDescription(): String{
        val  list = getList()
        return when{
            list.isEmpty()-> "0 contact"
            list.size == 1 -> "1 Contact"
            else -> "${list.size} Contact"
        }

    }

    fun  save (name: String, phone: String){
        validate(name, phone )

        val  contact = ContactEntity(name, phone)
        ContactRepository.save(contact)

    }

    fun delete(name: String, phone: String){
        validateDelete(name, phone)

        val  contact = ContactEntity(name, phone)
        ContactRepository.delete(contact)
    }

    fun getList(): List<ContactEntity>{
        return ContactRepository.getList()
    }


}