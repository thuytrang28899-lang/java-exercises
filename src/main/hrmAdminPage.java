package Locator;

import org.openqa.selenium.By;

public class hrmAdminPage {

    // 1
    By adminMenu = By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");

    // 2
    By pimMenu = By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");

    // 3
    By leaveMenu = By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span");

    // 4
    By usernameInput = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div/div[1]/div/div[2]/input");

    // 5
    By userRoleDropdown = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div");

    // 6
    By adminOption = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]");

    // 7
    By essOption = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[3]");

    // 8
    By employeeNameInput = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input");

    // 9
    By resetButton = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div[2]/button[1]");

    // 10
    By searchButton = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div[2]/button[2]");

    // 11
    By userManagementTab = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div[1]");

    // 12
    By usernameColumn = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div[1]/div/div[2]");

    // 13
    By userRoleColumn = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div[1]/div/div[3]");

    // 14
    By employeeNameColumn = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div[1]/div/div[4]");

    // 15
    By statusColumn = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div[1]/div/div[5]");

    // 16
    By deleteIcon = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div[2]/div/div/div[6]/div/button[1]");

    // 17
    By editIcon = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div[2]/div/div/div[6]/div/button[2]");

    // 18
    By userManagementDropdown = By.xpath("//*[@id='app']/div[1]/div[2]/div[1]/header/div[2]/nav/ul/li[1]");

    // 19
    By sideBarToggle = By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/div/div/button");

    // 20
    By settingIcon = By.xpath("//*[@id='app']/div[1]/div[2]/div[1]/header/div[1]/div[3]/button");

    // 21
    By addButton = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[1]/div/button");

}