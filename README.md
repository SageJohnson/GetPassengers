App Description:

  GetPassengers is an Android application that allows the user to create and accumulate a passenger list, then return it to the main screen.
  The first activity has a callback function that routes to the second activity upon click of the Get Passenger List button. After routing to
  the second activity, a passenger list can be accumulated. After accumulation, the Return List button executes the callback function from the
  first activity, and carries out some data processing to eventually display the list in the first activity. These activities work together by
  utilizing a contractual Activity Result feature.

Challenges and Solutions:

  The main roadblock I faced in developing this application was based in syntax and control flow. I had trouble with the for loop syntax needed to
  process the data in the backToMain function (GetPassengers.kt), and also in the lambda in the callback (MainActivity.kt), and I also had trouble
  with recognizing the control flow of these for loops. The lambda functions were intuitive, but I lacked the knowledge in so far as how they worked.
  I solved these issues by utilizing the documentation for Android Studio and Kotlin, as well as my debugging skills. I ran the program several times
  until reaching a solution that I was satisfied with.

Key Learnings:

  The key components I learned by developing this application include: Kotlin lambda functions, the key word let, for loop syntax and control flow,
  constraints in ConstraintLayout, activity callback functions between two given activities, and the packing of data into an Intent.

  It is important to note that all of these key concepts intertwined with each other - let and lambda functions were a powerful combination,
  while for loops and activity callback functions allowed me to unpack data sent from the second activity through an Intent, and XML constraints
  allowed me to have a screen layout based on relative positioning of XML elements.

Future Improvements:

  If I had more time, I would have played around with styling. Specifically, I would have tinkered with the XML layout, perhaps added another activity
  to display the passenger list in a more intuitive way, and changed the color scheme to make things look a little more appealing. I come from a background
  of poor styling skills, so I like the idea of developing those skills.

  On another note, I'd like to learn more about different layouts and Material Design elements. So far, I only know GridLayout, LinearLayout, and
  ConstraintLayout. By adding more to my list of options, I am confident that I can develop a wider variety of applications.
  
