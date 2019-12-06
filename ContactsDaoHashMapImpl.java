package com.slk.assignment22.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.slk.assignment22.dao.ContactsDao;
import com.slk.assignment22.dao.DaoException;
import com.slk.assignment22.entity.Contact;

public class ContactsDaoHashMapImpl implements ContactsDao {

private Map<Integer, Contact> map;

public ContactsDaoHashMapImpl() {
map = new HashMap<>();
}

@Override
public void addContact(Contact contact) throws DaoException {
map.put(contact.getId(), contact);
}

@Override
public Contact getContact(int id) throws DaoException {

return map.get(id);
}

@Override
public void updateContact(Contact contact) throws DaoException {
if (map.containsKey(contact.getId())) {
map.put(contact.getId(), contact);
} else {
throw new DaoException("Not Updated");
}

}

@Override
public void deleteContact(int id) throws DaoException {
if (map.containsKey(id)) {
map.remove(id);
} else {
throw new DaoException("Not Deleted");
}
}

@Override
public Contact getContactByEmail(String email) throws DaoException {
for (Contact c : map.values()) {
if (c.getEmail().equals(email)) {
return c;
}
}
return null;
}

@Override
public Contact getContactByPhone(String phone) throws DaoException {
for (Contact c : map.values()) {
if (c.getPhone().equals(phone)) {
return c;
}
}
return null;
}

@Override
public List<Contact> getContactsByLastname(String lastname) throws DaoException {
List<Contact> list = new ArrayList<>();
for (Contact c : map.values()) {
if (c.getLastname().equals(lastname)) {
list.add(c);
}
}
return list;
}

@Override
public List<Contact> getContactsByCity(String city) throws DaoException {
List<Contact> list = new ArrayList<>();
for (Contact c : map.values()) {
if (c.getCity().equals(city)) {
list.add(c);
}
}
return list;
}

@SuppressWarnings({ })
@Override
public List<Contact> getContacts() throws DaoException {

List<Contact> list = new ArrayList<>();
for (Contact c : map.values()) {
list.add(c);
}
return list;
}

@Override
public List<Contact> getContactsByBirthDate(Date from, Date to) throws DaoException {
List<Contact> list = new ArrayList<>();
for (Contact c : map.values()) {
Date dob = c.getBirthDate();
if (dob.after(from) && dob.before(to)) {
list.add(c);
}
}
return list;
}
}

