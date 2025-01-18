# Shreni-Lab1: "Hello Android" Application - Activity Lifecycle

## 0.1 Abstract

Create a simple "Hello Android" application using the Android Studio template, and modify the code to monitor the activity lifecycle. Commit the code to a local repository and then push it to GitHub. Add log information using `Log.d()` in each of the 7 callback functions in the main activity.

## 0.2 Introduction

The objective of this lab was to create a simple "Hello Android" application and explore the activity lifecycle of the application. This was done by adding activity-lifecycle callback functions. The Activity class provides a core set of six callbacks to navigate transitions between stages of the activity lifecycle:

- `onCreate()`
- `onStart()`
- `onResume()`
- `onPause()`
- `onStop()`
- `onDestroy()`

The system invokes each of these callbacks as the activity enters a new state.

## 0.3 Procedures

This application was created in Android Studio using Jetpack Compose, a modern toolkit for building native UIs. The project was created using the "Empty Activity" template. 

### Steps:
1. The project structure includes `MainActivity.kt` as the main file for functionality and layout creation. Since Jetpack Compose is used, no XML files are necessary for the layout.
2. Initially, the "Hello Android" message is displayed.
3. The activity-lifecycle callback functions were added:
   - `onCreate()`: Fires when the system first creates the activity. It performs basic startup logic for the activity.
   - `onStart()`: Invoked when the activity enters the "Started" state, making the activity visible to the user.
   - `onResume()`: Called when the activity enters the "Resumed" state, where the app interacts with the user.
   - `onPause()`: Called when the activity is no longer in the foreground but may still be visible.
   - `onStop()`: Called when the activity is no longer visible to the user.
   - `onDestroy()`: Called when the activity is fully dismissed or destroyed.

### Callback Function Flow:
- **Open the app**: `onCreate` → `onStart` → `onResume`
- **Close the app**: `onPause` → `onStop`
- **Open the app again from the background**: `onPause` → `onStop` → `onRestart` → `onStart` → `onResume`
- **Close the app and kill it**: `onPause` → `onStop` → `onDestroy`
- **On clicking home**: `onPause` → `onStop`

## 0.4 Results

This application shows the activity lifecycle by invoking all 7 callback functions in the main activity. The following order of callback functions was observed as the app moved through different states.

**GitHub link** to the repository of this lab: [Shreni-Lab1](https://github.com/yourusername/Shreni-Lab1)

## 0.5 Conclusion

This lab helped me understand the creation of an application and explore the activity lifecycle in detail. A deep understanding of these concepts is important for building bug-free applications. I was able to understand how an activity reacts to various events. Proper handling of the activity lifecycle ensures smooth app functionality.

## 0.6 References

- [The Android Activity Lifecycle](https://developer.android.com/guide/components/activities/activity-lifecycle)
