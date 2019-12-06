package com.slk.assignment22.dao;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.slk.assignment22.dao.ContactsDao;
import com.slk.assignment22.dao.DaoException;
import com.slk.assignment22.entity.Contact;

public class ContactsDaoArrayListImpl implements ContactsDao {

private List<Contact> list;

public ContactsDaoArrayListImpl() {
list = new ArrayList<>();
list.add(new Contact("Aishwarya", "Belgaonkar", "arbelgaonkar@abc.com", "8884136122", "Belgaum"));
    list.add(new Contact("sanjana", "kondapally", "sanjana@abc.com", "9663946467", "hyd"));
}

@Override
public void addContact(Contact contact) throws DaoException {

list.add(contact);

}

@Override
public Contact getContact(int id) throws DaoException {

for (Contact c : list) {
if (c.getId() == id)
return c;
}
return null;
}

@Override
public void updateContact(Contact contact) throws DaoException {

for (int i = 0, j = list.size(); i < j; i++) {
Contact c = list.get(i);
if (c.getId() == contact.getId()) {
list.set(i, contact);
}
}
}

@Override
public void deleteContact(int id) throws DaoException {
for (int i = 0, j = list.size(); i < j; i++) {
Contact c = list.get(i);
if (c.getId() == id) {
list.remove(i);
break;
}
}
}

@Override
public Contact getContactByEmail(String email) throws DaoException {
if (email == null) {
return null;
}

for (Contact contact : list) {
if (contact.getEmail().equalsIgnoreCase(email)) {
return contact;
}
}
return null;
}

@Override
public Contact getContactByPhone(String phone) throws DaoException {
if (phone == null) {
return null;
}

for (Contact contact : list) {
if (contact.getPhone().equalsIgnoreCase(phone)) {
return contact;
}
}
return null;
}

@Override
public List<Contact> getContactsByLastname(String lastname) throws DaoException {
List<Contact> newList = new ArrayList<>();
for (Contact c : list) {
if (c.getLastname().equalsIgnoreCase(lastname)) {
newList.add(c);
}
}
return newList;
}

@Override
public List<Contact> getContactsByCity(String city) throws DaoException {
List<Contact> newList = new ArrayList<>();
for (Contact c : list) {
if (c.getCity().equalsIgnoreCase(city)) {
newList.add(c);
}
}
return newList;
}

@Override
public List<Contact> getContacts() throws DaoException {
List<Contact> newList = new ArrayList<>();
for (Contact c : list) {

newList.add(c);
}
return newList;
}

@Override
public List<Contact> getContactsByBirthDate(Date from, Date to) throws DaoException {

return null;
}
}