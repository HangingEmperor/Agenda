package sample;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

import java.util.Objects;

public class Person {

    private String id;
    private String name;
    private String lastName;
    private Button completeName;

    private String nickName;
    private String birthday;
    private Image profilePicture;

    private String email;
    private String phone;
    private String mobile;
    private String notes;

    /**/
    private String company;
    private String position;

    private String country;
    private String state;
    private String city;
    private String address;
    private String postalCode;

    private String website;
    private String socialNetworksFacebook;
    private String socialNetworksTwitter;
    private String socialNetworksInstagram;

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }

    public Person(String id, String name, String lastName, Button completeName, String nickName, String birthday, Image profilePicture, String email, String phone, String mobile, String notes, String company, String position, String country, String state, String city, String address, String postalCode, String website, String socialNetworksFacebook, String socialNetworksTwitter, String socialNetworksInstagram) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.completeName = completeName;
        this.nickName = nickName;
        this.birthday = birthday;
        this.profilePicture = profilePicture;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
        this.notes = notes;
        this.company = company;
        this.position = position;
        this.country = country;
        this.state = state;
        this.city = city;
        this.address = address;
        this.postalCode = postalCode;
        this.website = website;
        this.socialNetworksFacebook = socialNetworksFacebook;
        this.socialNetworksTwitter = socialNetworksTwitter;
        this.socialNetworksInstagram = socialNetworksInstagram;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Button getCompleteName() {
        return completeName;
    }

    public void setCompleteName(Button completeName) {
        this.completeName = completeName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Image getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Image profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSocialNetworksFacebook() {
        return socialNetworksFacebook;
    }

    public void setSocialNetworksFacebook(String socialNetworksFacebook) {
        this.socialNetworksFacebook = socialNetworksFacebook;
    }

    public String getSocialNetworksTwitter() {
        return socialNetworksTwitter;
    }

    public void setSocialNetworksTwitter(String socialNetworksTwitter) {
        this.socialNetworksTwitter = socialNetworksTwitter;
    }

    public String getSocialNetworksInstagram() {
        return socialNetworksInstagram;
    }

    public void setSocialNetworksInstagram(String socialNetworksInstagram) {
        this.socialNetworksInstagram = socialNetworksInstagram;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", profilePicture=" + profilePicture +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", notes='" + notes + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", website='" + website + '\'' +
                ", socialNetworksFacebook='" + socialNetworksFacebook + '\'' +
                ", socialNetworksTwitter='" + socialNetworksTwitter + '\'' +
                ", socialNetworksInstagram='" + socialNetworksInstagram + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) &&
                Objects.equals(name, person.name) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(nickName, person.nickName) &&
                Objects.equals(birthday, person.birthday) &&
                Objects.equals(profilePicture, person.profilePicture) &&
                Objects.equals(email, person.email) &&
                Objects.equals(phone, person.phone) &&
                Objects.equals(mobile, person.mobile) &&
                Objects.equals(notes, person.notes) &&
                Objects.equals(company, person.company) &&
                Objects.equals(position, person.position) &&
                Objects.equals(country, person.country) &&
                Objects.equals(state, person.state) &&
                Objects.equals(city, person.city) &&
                Objects.equals(address, person.address) &&
                Objects.equals(postalCode, person.postalCode) &&
                Objects.equals(website, person.website) &&
                Objects.equals(socialNetworksFacebook, person.socialNetworksFacebook) &&
                Objects.equals(socialNetworksTwitter, person.socialNetworksTwitter) &&
                Objects.equals(socialNetworksInstagram, person.socialNetworksInstagram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, nickName, birthday, profilePicture, email, phone, mobile, notes, company, position, country, state, city, address, postalCode, website, socialNetworksFacebook, socialNetworksTwitter, socialNetworksInstagram);
    }
}
