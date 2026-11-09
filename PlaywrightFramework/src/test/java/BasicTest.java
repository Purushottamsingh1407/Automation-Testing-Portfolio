// Import assertThat() method for validations
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.testng.Assert;
// TestNG annotations
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Playwright classes
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.LocatorAssertions;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.AriaRole;

public class BasicTest {

    // Page object used for browser page actions
    Page page;

    // Browser object used to launch browser
    Browser browser;

    // Main Playwright object
    Playwright playwright;

    @BeforeMethod
    public void setup() {

        // Start Playwright
        playwright = Playwright.create();

        // Open Chrome browser in visible mode
        browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions()
                        .setChannel("chrome")
                        .setHeadless(false));

        // Create a new browser tab/page
        page = browser.newPage();
//timeout for all the actions        
page.setDefaultTimeout(8000);
        // Open EventHub login page
        page.navigate("https://eventhub.rahulshettyacademy.com/login");
        //Applying Global Timeout 
        PlaywrightAssertions.setDefaultAssertionTimeout(7000);
    }

    @Test(description = "Create Event - Book that event and verify it is booked")
    public void DemoTest() {

        // Create a fresh browser tab
        page = browser.newPage();

        // Open login page
        page.navigate("https://eventhub.rahulshettyacademy.com/login");

        // Print page title in console
        System.out.println(page.title());

        // Verify page title is correct
        assertThat(page).hasTitle("EventHub — Discover & Book Events");

        // Enter email address
        page.getByPlaceholder("you@email.com")
                .fill("singh.Purushottam.1407@gmail.com");

        // Enter password
        page.getByPlaceholder("••••••")
                .fill("Purushottam@1");

        // Click Sign In button
        page.getByRole(AriaRole.BUTTON,
                new Page.GetByRoleOptions()
                        .setName("Sign In"))
                .click();

        // Verify user logged in successfully
        assertThat(
                page.getByRole(
                        AriaRole.LINK,
                        new Page.GetByRoleOptions()
                                .setName("Browse Events →")))
                .isVisible();

        // Click Admin button
        page.getByRole(
                AriaRole.BUTTON,
                new Page.GetByRoleOptions()
                        .setName("Admin"))
                .click();
// GOING TO ADMIN LINK WITH LOCATORS NOT WITH DIRECT LINK
        // Verify Manage Events option is displayed
        assertThat(
                page.getByRole(
                        AriaRole.LINK,
                        new Page.GetByRoleOptions()
                                .setName("Manage Events"))
                        .first())
                .isVisible();

        // Click Manage Events
        page.getByRole(
                AriaRole.LINK,
                new Page.GetByRoleOptions()
                        .setName("Manage Events"))
                .first()
                .click();
// Open Create Event page directly
page.navigate("https://eventhub.rahulshettyacademy.com/admin/events");

// Enter event title
page.locator("#event-title-input")
    .fill("QA Summit Purushottam singh");

// Enter event description
page.locator("#admin-event-form textarea")
    .fill("Woekshop about use of ai in testing");

// Select event category
page.getByLabel("Category")
    .selectOption("Workshop");

// Enter event city
page.getByPlaceholder("e.g. Bangalore")
    .fill("Bangalore");

// Enter event venue
page.getByLabel("Venue")
    .fill("Whitefield");

// Select event date and time
page.getByLabel("Event Date & Time")
    .fill("2026-12-17T01:25");

// Enter ticket price
page.getByLabel("Price ($)")
    .fill("350");

// Enter total seats available
page.getByLabel("Total Seats")
    .fill("100");

// Optional: Add event image URL
// page.getByLabel("Image URL (optional)")
//     .fill("https.purushottam sigh");

// Click Add Event button
page.getByRole(
        AriaRole.BUTTON,
        new Page.GetByRoleOptions().setName("+ Add Event"))
    .click();

// Verify event created successfully and applying 
assertThat(page.getByText("Event created!"))
    .isVisible();

//Find Newely created event in event page
page.locator("#nav-events").click();
Locator eventCards=page.getByTestId("event-card");
eventCards.first().waitFor();
System.out.println(eventCards.count());
//Visibility of the card which we have added
Locator targetCard=eventCards.filter(new Locator.FilterOptions().setHasText("QA Summit Purushottam singh"));
//Applying Assertion and local  assertion timeout 
assertThat(targetCard).isVisible(new LocatorAssertions.IsVisibleOptions().setTimeout(10000));

//CAPTURE THE NUMBER OF SHEETS SO WE CAN COMPARE AFTER
String SeatsText=targetCard.getByText("seats").innerText();
System.out.println(SeatsText);
int seatsNumBeforeBooking=Integer.parseInt(SeatsText.split(" ")[0]);
//clicking on booknow button
targetCard.getByTestId("book-now-btn").click();

page.getByLabel("Full Name").fill("Purushottam singh");
page.getByLabel("Email").fill("Singh.Purushottam.1407@gmail.com");
page.getByLabel("Phone Number").fill("78038144777");
page.getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName("Confirm Booking")).click();
assertThat(page.getByText("Your tickets are reserved.")).isVisible();
String bookingRef = page.locator(".booking-ref").first().innerText().trim();
System.out.println("Booking Reference: " + bookingRef);
page.getByRole(AriaRole.LINK,new Page.GetByRoleOptions().setName("View My Booking")).click();

//verify in Booking History using the actual booking reference created in this flow
Locator bookingRefLocator = page.locator(".booking-ref")
        .filter(new Locator.FilterOptions().setHasText(bookingRef));
assertThat(bookingRefLocator.first()).isVisible(new LocatorAssertions.IsVisibleOptions().setTimeout(10000));

//seat count reduction check
page.locator("#nav-events").click();
page.waitForTimeout(1000); 
Locator eventCardsafterBooking=page.getByTestId("event-card");
eventCards.first().waitFor();
//Visibility of the card which we have added
Locator targetCardAfterBooking=eventCards.filter(new Locator.FilterOptions().setHasText("QA Summit Purushottam singh"));
String seatTextAfterBooking= targetCardAfterBooking.getByText("seats").innerText();
System.out.println(seatTextAfterBooking);
int seatsNumAbooking=Integer.parseInt(seatTextAfterBooking.split(" ")[0]);
Assert.assertTrue(seatsNumBeforeBooking > seatsNumAbooking);
    }
}