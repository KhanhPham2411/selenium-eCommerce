package pagedom;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderDetailPageDom {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/about-magento-demo-store/']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "a.skip-link.skip-account")
    @CacheLookup
    private WebElement account;

    @FindBy(css = "#top body.sales-order-view.customer-account div.wrapper div.page div:nth-of-type(2) div.main div:nth-of-type(1) div.block.block-account div:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement accountDashboard;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/customer/account/edit/']")
    @CacheLookup
    private WebElement accountInformation;

    @FindBy(css = "button.button.btn-cart")
    @CacheLookup
    private WebElement addToCart;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/customer/address/']")
    @CacheLookup
    private WebElement addressBook;

    @FindBy(css = "a[title='Advanced Search']")
    @CacheLookup
    private WebElement advancedSearch;

    @FindBy(css = "#top body.sales-order-view.customer-account div.wrapper div.page div:nth-of-type(2) div.main div:nth-of-type(2) div.my-account div:nth-of-type(4) div.buttons-set p.back-link a")
    @CacheLookup
    private WebElement backToMyOrders;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/sales/billing_agreement/']")
    @CacheLookup
    private WebElement billingAgreements;

    @FindBy(css = "a.skip-link.skip-cart")
    @CacheLookup
    private WebElement cart3;

    @FindBy(css = "a.button.checkout-button")
    @CacheLookup
    private WebElement checkout1;

    @FindBy(css = "a.top-link-checkout")
    @CacheLookup
    private WebElement checkout2;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/contacts/']")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/customer-service/']")
    @CacheLookup
    private WebElement customerService;

    @FindBy(css = "a.btn-edit")
    @CacheLookup
    private WebElement editItem;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/lg-lcd.html']")
    @CacheLookup
    private WebElement lgLcd;

    @FindBy(css = "a[title='Log Out']")
    @CacheLookup
    private WebElement logOut;

    @FindBy(css = "a.skip-link.skip-nav")
    @CacheLookup
    private WebElement menu;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/mobile.html']")
    @CacheLookup
    private WebElement mobile;

    @FindBy(css = "#header-account div.links ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement myAccount1;

    @FindBy(css = "#top body.sales-order-view.customer-account div.wrapper div.page div:nth-of-type(3) div.footer div:nth-of-type(4) ul li.first a")
    @CacheLookup
    private WebElement myAccount2;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/oauth/customer_token/']")
    @CacheLookup
    private WebElement myApplications;

    @FindBy(css = "a.top-link-cart")
    @CacheLookup
    private WebElement myCart3Items;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/downloadable/customer/products/']")
    @CacheLookup
    private WebElement myDownloadableProducts;

    @FindBy(css = "#top body.sales-order-view.customer-account div.wrapper div.page div:nth-of-type(2) div.main div:nth-of-type(1) div.block.block-account div:nth-of-type(2) ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement myOrders;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/review/customer/']")
    @CacheLookup
    private WebElement myProductReviews;

    @FindBy(css = "#top body.sales-order-view.customer-account div.wrapper div.page div:nth-of-type(2) div.main div:nth-of-type(1) div.block.block-account div:nth-of-type(2) ul li:nth-of-type(8) a")
    @CacheLookup
    private WebElement myWishlist;

    @FindBy(css = "a[title='My Wishlist (2 items)']")
    @CacheLookup
    private WebElement myWishlist2Items;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/newsletter/manage/']")
    @CacheLookup
    private WebElement newsletterSubscriptions;

    @FindBy(id = "qbutton-88256")
    @CacheLookup
    private WebElement ok;

    @FindBy(id = "reorder-item-9754")
    @CacheLookup
    private WebElement orderDateNovember2820181;

    @FindBy(id = "reorder-item-9753")
    @CacheLookup
    private WebElement orderDateNovember2820182;

    private final String pageLoadedText = "Order Date: November 28, 2018";

    private final String pageUrl = "/index.php/sales/order/view/order_id/8417/";

    @FindBy(css = "a.link-print")
    @CacheLookup
    private WebElement printOrder;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/privacy-policy-cookie-restriction-mode/']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/sales/recurring_profile/']")
    @CacheLookup
    private WebElement recurringProfiles;

    @FindBy(css = "a.remove")
    @CacheLookup
    private WebElement removeItem;

    @FindBy(css = "a.link-reorder")
    @CacheLookup
    private WebElement reorder;

    @FindBy(css = "a.skip-link.skip-search")
    @CacheLookup
    private WebElement search1;

    @FindBy(id = "qinput-88256")
    @CacheLookup
    private WebElement search2;

    @FindBy(id = "search")
    @CacheLookup
    private WebElement search3;

    @FindBy(css = "button.button.search-button")
    @CacheLookup
    private WebElement search4;

    @FindBy(css = "a[title='Search Terms']")
    @CacheLookup
    private WebElement searchTerms;

    @FindBy(id = "newsletter")
    @CacheLookup
    private WebElement signUpForOurNewsletter;

    @FindBy(css = "a[title='Site Map']")
    @CacheLookup
    private WebElement siteMap;

    @FindBy(css = "a.product-image")
    @CacheLookup
    private WebElement sonyXperia1;

    @FindBy(css = "#cart-sidebar li.item.last.odd div.product-details p.product-name a")
    @CacheLookup
    private WebElement sonyXperia2;

    @FindBy(css = "#cart-sidebar-reorder li:nth-of-type(1) p.product-name a")
    @CacheLookup
    private WebElement sonyXperia3;

    @FindBy(css = "button[title='Subscribe']")
    @CacheLookup
    private WebElement subscribe;

    @FindBy(css = "a[href='http://live.guru99.com/index.php/tv.html']")
    @CacheLookup
    private WebElement tv;

    @FindBy(css = "#reorder-validate-detail div.block-content div:nth-of-type(2) a")
    @CacheLookup
    private WebElement viewAll;

    @FindBy(css = "a.cart-link")
    @CacheLookup
    private WebElement viewShoppingCart;

    public OrderDetailPageDom() {
    }

    public OrderDetailPageDom(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public OrderDetailPageDom(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public OrderDetailPageDom(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Account Dashboard Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickAccountDashboardLink() {
        accountDashboard.click();
        return this;
    }

    /**
     * Click on Account Information Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickAccountInformationLink() {
        accountInformation.click();
        return this;
    }

    /**
     * Click on Account Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickAccountLink() {
        account.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickAddToCartButton() {
        addToCart.click();
        return this;
    }

    /**
     * Click on Address Book Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickAddressBookLink() {
        addressBook.click();
        return this;
    }

    /**
     * Click on Advanced Search Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickAdvancedSearchLink() {
        advancedSearch.click();
        return this;
    }

    /**
     * Click on Back To My Orders Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickBackToMyOrdersLink() {
        backToMyOrders.click();
        return this;
    }

    /**
     * Click on Billing Agreements Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickBillingAgreementsLink() {
        billingAgreements.click();
        return this;
    }

    /**
     * Click on Cart 3 Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickCart3Link() {
        cart3.click();
        return this;
    }

    /**
     * Click on Checkout Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickCheckout1Link() {
        checkout1.click();
        return this;
    }

    /**
     * Click on Checkout Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickCheckout2Link() {
        checkout2.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Customer Service Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickCustomerServiceLink() {
        customerService.click();
        return this;
    }

    /**
     * Click on Edit Item Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickEditItemLink() {
        editItem.click();
        return this;
    }

    /**
     * Click on Lg Lcd Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickLgLcdLink() {
        lgLcd.click();
        return this;
    }

    /**
     * Click on Log Out Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickLogOutLink() {
        logOut.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickMenuLink() {
        menu.click();
        return this;
    }

    /**
     * Click on Mobile Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickMobileLink() {
        mobile.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickMyAccount1Link() {
        myAccount1.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickMyAccount2Link() {
        myAccount2.click();
        return this;
    }

    /**
     * Click on My Applications Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickMyApplicationsLink() {
        myApplications.click();
        return this;
    }

    /**
     * Click on My Cart 3 Items Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickMyCart3ItemsLink() {
        myCart3Items.click();
        return this;
    }

    /**
     * Click on My Downloadable Products Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickMyDownloadableProductsLink() {
        myDownloadableProducts.click();
        return this;
    }

    /**
     * Click on My Orders Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickMyOrdersLink() {
        myOrders.click();
        return this;
    }

    /**
     * Click on My Product Reviews Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickMyProductReviewsLink() {
        myProductReviews.click();
        return this;
    }

    /**
     * Click on My Wishlist 2 Items Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickMyWishlist2ItemsLink() {
        myWishlist2Items.click();
        return this;
    }

    /**
     * Click on My Wishlist Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickMyWishlistLink() {
        myWishlist.click();
        return this;
    }

    /**
     * Click on Newsletter Subscriptions Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickNewsletterSubscriptionsLink() {
        newsletterSubscriptions.click();
        return this;
    }

    /**
     * Click on Ok Button.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickOkButton() {
        ok.click();
        return this;
    }

    /**
     * Click on Print Order Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickPrintOrderLink() {
        printOrder.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Recurring Profiles Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickRecurringProfilesLink() {
        recurringProfiles.click();
        return this;
    }

    /**
     * Click on Remove Item Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickRemoveItemLink() {
        removeItem.click();
        return this;
    }

    /**
     * Click on Reorder Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickReorderLink() {
        reorder.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickSearch4Button() {
        search4.click();
        return this;
    }

    /**
     * Click on Search Terms Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickSearchTermsLink() {
        searchTerms.click();
        return this;
    }

    /**
     * Click on Site Map Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickSiteMapLink() {
        siteMap.click();
        return this;
    }

    /**
     * Click on Sony Xperia Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickSonyXperia1Link() {
        sonyXperia1.click();
        return this;
    }

    /**
     * Click on Sony Xperia Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickSonyXperia2Link() {
        sonyXperia2.click();
        return this;
    }

    /**
     * Click on Sony Xperia Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickSonyXperia3Link() {
        sonyXperia3.click();
        return this;
    }

    /**
     * Click on Subscribe Button.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickSubscribeButton() {
        subscribe.click();
        return this;
    }

    /**
     * Click on Tv Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickTvLink() {
        tv.click();
        return this;
    }

    /**
     * Click on View All Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickViewAllLink() {
        viewAll.click();
        return this;
    }

    /**
     * Click on View Shopping Cart Link.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom clickViewShoppingCartLink() {
        viewShoppingCart.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom fill() {
        setSearch2TextField();
        setSearch3SearchField();
        setOrderDateNovember2820181CheckboxField();
        setOrderDateNovember2820182CheckboxField();
        setSignUpForOurNewsletterEmailField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set Order Date November 28 2018 Checkbox field.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom setOrderDateNovember2820181CheckboxField() {
        if (!orderDateNovember2820181.isSelected()) {
            orderDateNovember2820181.click();
        }
        return this;
    }

    /**
     * Set Order Date November 28 2018 Checkbox field.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom setOrderDateNovember2820182CheckboxField() {
        if (!orderDateNovember2820182.isSelected()) {
            orderDateNovember2820182.click();
        }
        return this;
    }

    /**
     * Set default value to Search Text field.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom setSearch1TextField() {
        return setSearch1TextField(data.get("SEARCH_1"));
    }

    /**
     * Set value to Search Text field.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom setSearch1TextField(String search1Value) {
        search1.click();
        return this;
    }

    /**
     * Set default value to Search Text field.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom setSearch2TextField() {
        return setSearch2TextField(data.get("SEARCH_2"));
    }

    /**
     * Set value to Search Text field.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom setSearch2TextField(String search2Value) {
        search2.sendKeys(search2Value);
        return this;
    }

    /**
     * Set default value to Search Search field.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom setSearch3SearchField() {
        return setSearch3SearchField(data.get("SEARCH_3"));
    }

    /**
     * Set value to Search Search field.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom setSearch3SearchField(String search3Value) {
        search3.sendKeys(search3Value);
        return this;
    }

    /**
     * Set default value to Sign Up For Our Newsletter Email field.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom setSignUpForOurNewsletterEmailField() {
        return setSignUpForOurNewsletterEmailField(data.get("SIGN_UP_FOR_OUR_NEWSLETTER"));
    }

    /**
     * Set value to Sign Up For Our Newsletter Email field.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom setSignUpForOurNewsletterEmailField(String signUpForOurNewsletterValue) {
        signUpForOurNewsletter.sendKeys(signUpForOurNewsletterValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom submit() {
        clickOkButton();
        return this;
    }

    /**
     * Unset Order Date November 28 2018 Checkbox field.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom unsetOrderDateNovember2820181CheckboxField() {
        if (orderDateNovember2820181.isSelected()) {
            orderDateNovember2820181.click();
        }
        return this;
    }

    /**
     * Unset Order Date November 28 2018 Checkbox field.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom unsetOrderDateNovember2820182CheckboxField() {
        if (orderDateNovember2820182.isSelected()) {
            orderDateNovember2820182.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the OrderDetailPageDom class instance.
     */
    public OrderDetailPageDom verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
