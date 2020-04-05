# simple navigation bar  
use RadioGroup ViewPager Fragment selector  
  
MainPage:ViewPager+RadioGroup  
  RadioButton:  
            android:background="@null"//disable click effect   
            android:button="@null"//disable select icon  
            android:checked="true"//this button is default selecting   
            android:drawableTop="@drawable/radio_home_icon_selector"//icon selector for different icon when selecting and not selecting  
            android:textColor="@color/radio_btn_text_selector" //color selector for different textcolor when selecting and not selecting  

HomeActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener 
onCheckedChanged:switch RadioButton id that be clicked and show fragment 
