package ru.osoloveva.testapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityFunctionalTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    private val button = withId(R.id.button1)
    private val textView = withId(R.id.textView1)

    @Test
    fun test() {
        // Проверка изменения текста на '2 stage' при первом нажатии на кнопку
        onView(button).perform(click())
        onView(textView).check(matches(withText("2 stage")))
        // Проверка изменения текста на '3 stage' при втором нажатии на кнопку
        onView(button).perform(click())
        onView(textView).check(matches(withText("3 stage")))
        // Проверка изменения текста на 'Done' при третьем нажатии на кнопку
        onView(button).perform(click())
        onView(textView).check(matches(withText("Done")))
        // Проверка того, что текст не меняется при последующем нажатии на кнопку
        onView(button).perform(click())
        onView(textView).check(matches(withText("Done")))
    }

}
