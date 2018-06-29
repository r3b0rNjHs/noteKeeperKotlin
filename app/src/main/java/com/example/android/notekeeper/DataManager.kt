package com.example.android.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()


    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "Java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)

    }

    private fun initializeNotes() {
        var note = NoteInfo(CourseInfo("android_intents", "Android Programming with Intents"),"Soy una prueba", "texto")
        notes.add(note)
        note = NoteInfo(CourseInfo("android_intents", "Android Programming with Intents"),"Soy una prueba22", "texto22")
        notes.add(note)
    }
}