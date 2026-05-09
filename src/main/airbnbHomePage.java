package Locator;

import org.openqa.selenium.By;

public class airbnbHomePage {

    // Header menu
    By aboutMenu = By.xpath("//a[text()='About']");

    By serviceMenu = By.xpath("//a[text()='Service']");

    By pricingMenu = By.xpath("//a[text()='Pricing']");

    By contactMenu = By.xpath("//a[text()='Contact']");

    // User icon
    By userIcon = By.xpath("//i[contains(@class,'fa-user')]");

    // Search section
    By locationInput = By.xpath("//input[@placeholder='Địa điểm']");

    By dateInput = By.xpath("//input[contains(@placeholder,'yyyy')]");

    By searchButton = By.xpath("//button[contains(text(),'Tìm kiếm')]");

    // Guest
    By guestButton = By.xpath("//button[contains(text(),'Khách')]");

    By increaseGuestButton = By.xpath("//button[contains(text(),'+')]");

    By decreaseGuestButton = By.xpath("//button[contains(text(),'-')]");

    // Location cards
    By hoChiMinhCard = By.xpath("//div[contains(text(),'Hồ Chí Minh')]");

    By haNoiCard = By.xpath("//div[contains(text(),'Hà Nội')]");

    By nhaTrangCard = By.xpath("//div[contains(text(),'Nha Trang')]");

}