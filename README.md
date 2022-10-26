# RecyclerViewKeyboardDemo
This is a sample app to repro the recyclerview item size issue when keyboard is opened/dismissed.
# System requirement
only repro on Android API >= 32

# Repro steps:
1. Launch app
2. Click EditText to open keyboard
3. Dismiss keyboard
4. Observed recyclerview item are not fully visible (item size is too small)
5. Click button to requestLayout for the 1st item
6. Observed the 1st item become visible (item size becomes normal)
