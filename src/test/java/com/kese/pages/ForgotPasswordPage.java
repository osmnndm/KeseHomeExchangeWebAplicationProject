package com.kese.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends CommonPage{

    @FindBy(xpath = "//a[@class='text-decoration-underline']")
    public WebElement sifremiUnuttumButtonu;


   /* @FindBy ( xpath = "//input[@placeholder='E-mail adresinizi giriniz']")
    public WebElement emailbutonu;*/

    @FindBy ( xpath = "//button[@type='submit']")
    public WebElement sifremiDegistirButton;

    @FindBy  (linkText= "Giriş Sayfasına Git")
    public WebElement girisSayfasinaYonlendirme;

    @FindBy  (xpath = "/a[contains(text(), \"Giriş Yap\")]")
    public WebElement girisyapButtonu;
}
