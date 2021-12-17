package com.pb.kozhara.hw11;

public class Contact {
    private String name;
    private LocalDate dateOfBirth;
    private String phones;
    private String address;
    private LocalDateTime modifyDate;

    public Contact(){
        this.modifyDate = LocalDateTime.now();
    }

    public Contact(String name, LocalDate dateOfBirth, String phones, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phones = phones;
        this.address = address;
        this.modifyDate = LocalDateTime.now();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(dateOfBirth, contact.dateOfBirth) && Objects.equals(phones, contact.phones) && Objects.equals(address, contact.address) && Objects.equals(modifyDate, contact.modifyDate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth, phones, address, modifyDate);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.modifyDate = LocalDateTime.now();
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.modifyDate = LocalDateTime.now();
    }
    public String getPhones() {
        return phones;
    }
    public void setPhones(String phones) {
        this.phones = phones;
        this.modifyDate = LocalDateTime.now();
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
        this.modifyDate = LocalDateTime.now();
    }
    public LocalDateTime getModifyDate() {
        return modifyDate;
    }
    public void setModifyDate() {
        this.modifyDate = LocalDateTime.now();
    }
}
