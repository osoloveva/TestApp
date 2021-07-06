package ru.osoloveva.testapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.PositionAssertions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityDesignTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    private val button = withId(R.id.button1)
    private val textView = withId(R.id.textView1)

    @Test
    fun test() {
        // Проверка отображения текста '1 stage'
        onView(textView)
            .check(matches(isDisplayed()))
            .check(matches(withText("1 stage")))
        // Проверка отображения кнопки с текстом 'Continue'
        onView(button)
            .check(matches(isDisplayed()))
            .check(matches(isClickable()))
            .check(matches(withText("Continue")))
            .check(isCompletelyBelow(textView))
    }

}