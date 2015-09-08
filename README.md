# FloatingActionButtonExample
A super simple example for floating action button   
![alt tag](https://github.com/JianhuiZhu/FloatingActionButtonExample/blob/master/example.gif)       
For the ease of learning material design, I try to make it as simple as possible, just a floating action button with on click listener.   
Have fun    

#Library    
    compile 'com.android.support:design:23.0.1'
    compile 'com.jakewharton:butterknife:7.0.1'   
#XML file     
###activity_main    
      <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
          xmlns:tools="http://schemas.android.com/tools"
          android:layout_width="match_parent"
          android:layout_height="match_parent"
          xmlns:app="http://schemas.android.com/apk/res-auto"
          android:id="@+id/container"
          android:background="@android:color/background_dark"
          tools:context=".MainActivity">
          <LinearLayout
              android:id="@+id/sub_container"
              android:layout_width="match_parent"
              android:layout_height="match_parent"
              android:orientation="vertical">
              <TextView
                  android:id="@+id/title"
                  android:text="Squirrels"
                  android:textSize="40sp"
                  android:textColor="@android:color/white"
                  android:background="@android:color/background_dark"
                  android:gravity="center"
                  android:layout_width="match_parent"
                  android:layout_height="wrap_content" />
          </LinearLayout>
          <android.support.design.widget.FloatingActionButton
              android:id="@+id/floating_action_button"
              android:layout_width="wrap_content"
              android:layout_height="wrap_content"
              android:layout_margin="16dp"
              android:clickable="true"
              android:src="@drawable/add"
              app:layout_anchor="@id/container"
              android:layout_alignParentBottom="true"
              android:layout_alignParentRight="true"
              app:layout_anchorGravity="bottom|right|end"/>
      
      </RelativeLayout>   
      
