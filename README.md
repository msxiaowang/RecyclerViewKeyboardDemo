# RecyclerViewKeyboardDemo
This is a sample app to repro the recyclerview item size issue when keyboard is opened/dismissed.
# System requirement
only repro on Android API >= 32

# Repro steps:
1. Put device to landscape mode to make it easier to repro
2. Launch app
3. Click EditText to open keyboard
4. Dismiss keyboard
5. Observed recyclerview item are not fully visible (item size is too small)
6. Click button to requestLayout for the 1st item
7. Observed the 1st item become visible (item size becomes normal)
