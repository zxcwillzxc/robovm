/*
 * Copyright (C) 2012 Trillian AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIScreenMode_class/Reference/Reference.html">UIScreenMode Class Reference</a>
 *   @since Available in iOS 3.2 and later.
 * </div>
 */
/*<library>*/@Library("UIKit")/*</library>*/
@NativeClass public class /*<name>*/ UIScreenMode /*</name>*/ 
    extends /*<extends>*/ NSObject /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UIScreenMode /*</name>*/.class);
    }

    private static final boolean X86 = Bro.IS_X86;
    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ UIScreenMode /*</name>*/.class);

    /*<constructors>*/
    protected UIScreenMode(SkipInit skipInit) { super(skipInit); }
    public UIScreenMode() {}
    
    /*</constructors>*/
    /*<properties>*/
    
    private static final Selector pixelAspectRatio = Selector.register("pixelAspectRatio");
    @Bridge(symbol = "objc_msgSend") private native static float objc_getPixelAspectRatio(UIScreenMode __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static float objc_getPixelAspectRatioSuper(ObjCSuper __super__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIScreenMode_class/Reference/Reference.html#//apple_ref/occ/instp/UIScreenMode/pixelAspectRatio">@property(readonly,nonatomic) CGFloat pixelAspectRatio</a>
     * @since Available in iOS 3.2 and later.
     */
    public float getPixelAspectRatio() {
        if (customClass) { return objc_getPixelAspectRatioSuper(getSuper(), pixelAspectRatio); } else { return objc_getPixelAspectRatio(this, pixelAspectRatio); }
    }
    
    private static final Selector size = Selector.register("size");
    @Bridge(symbol = "objc_msgSend") private native static @ByVal CGSize objc_getSize(UIScreenMode __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSend_stret") private native static void objc_getSize_stret(@StructRet CGSize __ret__, UIScreenMode __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static @ByVal CGSize objc_getSizeSuper(ObjCSuper __super__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper_stret") private native static void objc_getSizeSuper_stret(@StructRet CGSize __ret__, ObjCSuper __super__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIScreenMode_class/Reference/Reference.html#//apple_ref/occ/instp/UIScreenMode/size">@property(readonly,nonatomic) CGSize size</a>
     * @since Available in iOS 3.2 and later.
     */
    public CGSize getSize() {
        if (X86) { if (customClass) { return objc_getSizeSuper(getSuper(), size); } else { return objc_getSize(this, size); } } else { CGSize __ret__ = new CGSize(); if (customClass) { objc_getSizeSuper_stret(__ret__, getSuper(), size); } else { objc_getSize_stret(__ret__, this, size); } return __ret__; }
    }
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<callbacks>*/
    static class Callbacks {
        @Callback @BindSelector("pixelAspectRatio") public static float getPixelAspectRatio(UIScreenMode __self__, Selector __cmd__) { return __self__.getPixelAspectRatio(); }
        @Callback @BindSelector("size") public static @ByVal CGSize getSize(UIScreenMode __self__, Selector __cmd__) { return __self__.getSize(); }
    }
    /*</callbacks>*/

}
