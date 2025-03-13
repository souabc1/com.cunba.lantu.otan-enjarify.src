package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintSet
{
  public static SparseIntArray OooO;
  public static final int[] OooO0oo;
  public static SparseIntArray OooOO0;
  public boolean OooO00o;
  public String OooO0O0;
  public String OooO0OO = "";
  public int OooO0Oo = 0;
  public boolean OooO0o;
  public HashMap OooO0o0;
  public HashMap OooO0oO;
  
  static
  {
    int i = 4;
    int j = 8;
    int[] tmp8_6 = new int[3];
    int[] tmp9_8 = tmp8_6;
    int[] tmp9_8 = tmp8_6;
    tmp9_8[0] = 0;
    tmp9_8[1] = i;
    tmp9_8[2] = j;
    OooO0oo = tmp9_8;
    SparseIntArray localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    OooO = localSparseIntArray;
    localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    OooOO0 = localSparseIntArray;
    localSparseIntArray = OooO;
    int k = R.styleable.Constraint_layout_constraintLeft_toLeftOf;
    localSparseIntArray.append(k, 25);
    localSparseIntArray = OooO;
    k = R.styleable.Constraint_layout_constraintLeft_toRightOf;
    localSparseIntArray.append(k, 26);
    localSparseIntArray = OooO;
    k = R.styleable.Constraint_layout_constraintRight_toLeftOf;
    localSparseIntArray.append(k, 29);
    localSparseIntArray = OooO;
    k = R.styleable.Constraint_layout_constraintRight_toRightOf;
    localSparseIntArray.append(k, 30);
    localSparseIntArray = OooO;
    k = R.styleable.Constraint_layout_constraintTop_toTopOf;
    localSparseIntArray.append(k, 36);
    localSparseIntArray = OooO;
    k = R.styleable.Constraint_layout_constraintTop_toBottomOf;
    localSparseIntArray.append(k, 35);
    localSparseIntArray = OooO;
    k = R.styleable.Constraint_layout_constraintBottom_toTopOf;
    localSparseIntArray.append(k, i);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintBottom_toBottomOf;
    localSparseIntArray.append(i, 3);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintBaseline_toBaselineOf;
    localSparseIntArray.append(i, 1);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintBaseline_toTopOf;
    localSparseIntArray.append(i, 91);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintBaseline_toBottomOf;
    localSparseIntArray.append(i, 92);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_editor_absoluteX;
    k = 6;
    localSparseIntArray.append(i, k);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_editor_absoluteY;
    int m = 7;
    localSparseIntArray.append(i, m);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintGuide_begin;
    localSparseIntArray.append(i, 17);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintGuide_end;
    localSparseIntArray.append(i, 18);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintGuide_percent;
    localSparseIntArray.append(i, 19);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_guidelineUseRtl;
    localSparseIntArray.append(i, 99);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_orientation;
    int n = 27;
    localSparseIntArray.append(i, n);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintStart_toEndOf;
    localSparseIntArray.append(i, 32);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintStart_toStartOf;
    localSparseIntArray.append(i, 33);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintEnd_toStartOf;
    localSparseIntArray.append(i, 10);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintEnd_toEndOf;
    localSparseIntArray.append(i, 9);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_goneMarginLeft;
    int i1 = 13;
    localSparseIntArray.append(i, i1);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_goneMarginTop;
    int i2 = 16;
    localSparseIntArray.append(i, i2);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_goneMarginRight;
    int i3 = 14;
    localSparseIntArray.append(i, i3);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_goneMarginBottom;
    int i4 = 11;
    localSparseIntArray.append(i, i4);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_goneMarginStart;
    int i5 = 15;
    localSparseIntArray.append(i, i5);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_goneMarginEnd;
    int i6 = 12;
    localSparseIntArray.append(i, i6);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintVertical_weight;
    int i7 = 40;
    localSparseIntArray.append(i, i7);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintHorizontal_weight;
    int i8 = 39;
    localSparseIntArray.append(i, i8);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintHorizontal_chainStyle;
    int i9 = 41;
    localSparseIntArray.append(i, i9);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintVertical_chainStyle;
    localSparseIntArray.append(i, 42);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintHorizontal_bias;
    localSparseIntArray.append(i, 20);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintVertical_bias;
    localSparseIntArray.append(i, 37);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintDimensionRatio;
    localSparseIntArray.append(i, 5);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintLeft_creator;
    int i10 = 87;
    localSparseIntArray.append(i, i10);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintTop_creator;
    localSparseIntArray.append(i, i10);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintRight_creator;
    localSparseIntArray.append(i, i10);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintBottom_creator;
    localSparseIntArray.append(i, i10);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintBaseline_creator;
    localSparseIntArray.append(i, i10);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_layout_marginLeft;
    localSparseIntArray.append(i, 24);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_layout_marginRight;
    localSparseIntArray.append(i, 28);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_layout_marginStart;
    i10 = 31;
    localSparseIntArray.append(i, i10);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_layout_marginEnd;
    localSparseIntArray.append(i, j);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_layout_marginTop;
    localSparseIntArray.append(i, 34);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_layout_marginBottom;
    localSparseIntArray.append(i, 2);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_layout_width;
    localSparseIntArray.append(i, 23);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_layout_height;
    localSparseIntArray.append(i, 21);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintWidth;
    localSparseIntArray.append(i, 95);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintHeight;
    localSparseIntArray.append(i, 96);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_visibility;
    localSparseIntArray.append(i, 22);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_alpha;
    localSparseIntArray.append(i, 43);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_elevation;
    localSparseIntArray.append(i, 44);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_rotationX;
    localSparseIntArray.append(i, 45);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_rotationY;
    localSparseIntArray.append(i, 46);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_rotation;
    localSparseIntArray.append(i, 60);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_scaleX;
    localSparseIntArray.append(i, 47);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_scaleY;
    localSparseIntArray.append(i, 48);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_transformPivotX;
    localSparseIntArray.append(i, 49);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_transformPivotY;
    localSparseIntArray.append(i, 50);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_translationX;
    localSparseIntArray.append(i, 51);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_translationY;
    localSparseIntArray.append(i, 52);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_translationZ;
    localSparseIntArray.append(i, 53);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintWidth_default;
    localSparseIntArray.append(i, 54);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintHeight_default;
    localSparseIntArray.append(i, 55);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintWidth_max;
    localSparseIntArray.append(i, 56);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintHeight_max;
    localSparseIntArray.append(i, 57);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintWidth_min;
    localSparseIntArray.append(i, 58);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintHeight_min;
    localSparseIntArray.append(i, 59);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintCircle;
    localSparseIntArray.append(i, 61);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintCircleRadius;
    localSparseIntArray.append(i, 62);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintCircleAngle;
    localSparseIntArray.append(i, 63);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_animateRelativeTo;
    localSparseIntArray.append(i, 64);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_transitionEasing;
    localSparseIntArray.append(i, 65);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_drawPath;
    localSparseIntArray.append(i, 66);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_transitionPathRotate;
    localSparseIntArray.append(i, 67);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_motionStagger;
    localSparseIntArray.append(i, 79);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_android_id;
    localSparseIntArray.append(i, 38);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_motionProgress;
    localSparseIntArray.append(i, 68);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintWidth_percent;
    localSparseIntArray.append(i, 69);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintHeight_percent;
    localSparseIntArray.append(i, 70);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_wrapBehaviorInParent;
    localSparseIntArray.append(i, 97);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_chainUseRtl;
    localSparseIntArray.append(i, 71);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_barrierDirection;
    localSparseIntArray.append(i, 72);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_barrierMargin;
    localSparseIntArray.append(i, 73);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_constraint_referenced_ids;
    localSparseIntArray.append(i, 74);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_barrierAllowsGoneWidgets;
    localSparseIntArray.append(i, 75);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_pathMotionArc;
    localSparseIntArray.append(i, 76);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constraintTag;
    localSparseIntArray.append(i, 77);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_visibilityMode;
    localSparseIntArray.append(i, 78);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constrainedWidth;
    localSparseIntArray.append(i, 80);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_layout_constrainedHeight;
    localSparseIntArray.append(i, 81);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_polarRelativeTo;
    localSparseIntArray.append(i, 82);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_transformPivotTarget;
    localSparseIntArray.append(i, 83);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_quantizeMotionSteps;
    localSparseIntArray.append(i, 84);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_quantizeMotionPhase;
    localSparseIntArray.append(i, 85);
    localSparseIntArray = OooO;
    i = R.styleable.Constraint_quantizeMotionInterpolator;
    localSparseIntArray.append(i, 86);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_editor_absoluteY;
    localSparseIntArray.append(i, k);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_editor_absoluteY;
    localSparseIntArray.append(i, m);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_orientation;
    localSparseIntArray.append(i, n);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_goneMarginLeft;
    localSparseIntArray.append(i, i1);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_goneMarginTop;
    localSparseIntArray.append(i, i2);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_goneMarginRight;
    localSparseIntArray.append(i, i3);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_goneMarginBottom;
    localSparseIntArray.append(i, i4);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_goneMarginStart;
    localSparseIntArray.append(i, i5);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_goneMarginEnd;
    localSparseIntArray.append(i, i6);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintVertical_weight;
    localSparseIntArray.append(i, i7);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintHorizontal_weight;
    localSparseIntArray.append(i, i8);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle;
    localSparseIntArray.append(i, i9);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle;
    localSparseIntArray.append(i, 42);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintHorizontal_bias;
    localSparseIntArray.append(i, 20);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintVertical_bias;
    localSparseIntArray.append(i, 37);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintDimensionRatio;
    localSparseIntArray.append(i, 5);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintLeft_creator;
    j = 87;
    localSparseIntArray.append(i, j);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintTop_creator;
    localSparseIntArray.append(i, j);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintRight_creator;
    localSparseIntArray.append(i, j);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintBottom_creator;
    localSparseIntArray.append(i, j);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintBaseline_creator;
    localSparseIntArray.append(i, j);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_layout_marginLeft;
    localSparseIntArray.append(i, 24);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_layout_marginRight;
    localSparseIntArray.append(i, 28);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_layout_marginStart;
    localSparseIntArray.append(i, i10);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_layout_marginEnd;
    localSparseIntArray.append(i, 8);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_layout_marginTop;
    localSparseIntArray.append(i, 34);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_layout_marginBottom;
    localSparseIntArray.append(i, 2);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_layout_width;
    localSparseIntArray.append(i, 23);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_layout_height;
    localSparseIntArray.append(i, 21);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintWidth;
    localSparseIntArray.append(i, 95);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintHeight;
    localSparseIntArray.append(i, 96);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_visibility;
    localSparseIntArray.append(i, 22);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_alpha;
    localSparseIntArray.append(i, 43);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_elevation;
    localSparseIntArray.append(i, 44);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_rotationX;
    localSparseIntArray.append(i, 45);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_rotationY;
    localSparseIntArray.append(i, 46);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_rotation;
    localSparseIntArray.append(i, 60);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_scaleX;
    localSparseIntArray.append(i, 47);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_scaleY;
    localSparseIntArray.append(i, 48);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_transformPivotX;
    localSparseIntArray.append(i, 49);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_transformPivotY;
    localSparseIntArray.append(i, 50);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_translationX;
    localSparseIntArray.append(i, 51);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_translationY;
    localSparseIntArray.append(i, 52);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_translationZ;
    localSparseIntArray.append(i, 53);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintWidth_default;
    localSparseIntArray.append(i, 54);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintHeight_default;
    localSparseIntArray.append(i, 55);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintWidth_max;
    localSparseIntArray.append(i, 56);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintHeight_max;
    localSparseIntArray.append(i, 57);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintWidth_min;
    localSparseIntArray.append(i, 58);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintHeight_min;
    localSparseIntArray.append(i, 59);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintCircleRadius;
    localSparseIntArray.append(i, 62);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintCircleAngle;
    localSparseIntArray.append(i, 63);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_animateRelativeTo;
    localSparseIntArray.append(i, 64);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_transitionEasing;
    localSparseIntArray.append(i, 65);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_drawPath;
    localSparseIntArray.append(i, 66);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_transitionPathRotate;
    localSparseIntArray.append(i, 67);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_motionStagger;
    localSparseIntArray.append(i, 79);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_android_id;
    localSparseIntArray.append(i, 38);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_motionTarget;
    localSparseIntArray.append(i, 98);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_motionProgress;
    localSparseIntArray.append(i, 68);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintWidth_percent;
    localSparseIntArray.append(i, 69);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintHeight_percent;
    localSparseIntArray.append(i, 70);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_chainUseRtl;
    localSparseIntArray.append(i, 71);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_barrierDirection;
    localSparseIntArray.append(i, 72);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_barrierMargin;
    localSparseIntArray.append(i, 73);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_constraint_referenced_ids;
    localSparseIntArray.append(i, 74);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_barrierAllowsGoneWidgets;
    localSparseIntArray.append(i, 75);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_pathMotionArc;
    localSparseIntArray.append(i, 76);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constraintTag;
    localSparseIntArray.append(i, 77);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_visibilityMode;
    localSparseIntArray.append(i, 78);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constrainedWidth;
    localSparseIntArray.append(i, 80);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_constrainedHeight;
    localSparseIntArray.append(i, 81);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_polarRelativeTo;
    localSparseIntArray.append(i, 82);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_transformPivotTarget;
    localSparseIntArray.append(i, 83);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_quantizeMotionSteps;
    localSparseIntArray.append(i, 84);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_quantizeMotionPhase;
    localSparseIntArray.append(i, 85);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_quantizeMotionInterpolator;
    localSparseIntArray.append(i, 86);
    localSparseIntArray = OooOO0;
    i = R.styleable.ConstraintOverride_layout_wrapBehaviorInParent;
    localSparseIntArray.append(i, 97);
  }
  
  public ConstraintSet()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO0o0 = localHashMap;
    this.OooO0o = true;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO0oO = localHashMap;
  }
  
  public static ConstraintSet.Constraint OooOOO0(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser = Xml.asAttributeSet(paramXmlPullParser);
    ConstraintSet.Constraint localConstraint = new androidx/constraintlayout/widget/ConstraintSet$Constraint;
    localConstraint.<init>();
    int[] arrayOfInt = R.styleable.ConstraintOverride;
    paramXmlPullParser = paramContext.obtainStyledAttributes(paramXmlPullParser, arrayOfInt);
    OooOoo0(paramContext, localConstraint, paramXmlPullParser);
    paramXmlPullParser.recycle();
    return localConstraint;
  }
  
  public static void OooOo(Object paramObject, TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    if (paramObject == null) {
      return;
    }
    TypedValue localTypedValue = paramTypedArray.peekValue(paramInt1);
    int i = localTypedValue.type;
    int j = 3;
    if (i != j)
    {
      j = 5;
      int k = 0;
      if (i != j)
      {
        m = paramTypedArray.getInt(paramInt1, 0);
        paramInt1 = -4;
        i = -2;
        if (m != paramInt1)
        {
          paramInt1 = -3;
          if (m != paramInt1)
          {
            if (m != i)
            {
              paramInt1 = -1;
              if (m == paramInt1) {}
            }
          }
          else
          {
            m = 0;
            paramTypedArray = null;
            break label122;
          }
        }
        else
        {
          m = 1;
          k = i;
          break label122;
        }
      }
      else
      {
        m = paramTypedArray.getDimensionPixelSize(paramInt1, 0);
      }
      k = m;
      int m = 0;
      paramTypedArray = null;
      label122:
      paramInt1 = paramObject instanceof ConstraintLayout.LayoutParams;
      if (paramInt1 != 0)
      {
        paramObject = (ConstraintLayout.LayoutParams)paramObject;
        if (paramInt2 == 0)
        {
          paramObject.width = k;
          paramObject.OoooOoo = m;
        }
        else
        {
          paramObject.height = k;
          paramObject.Ooooo00 = m;
        }
      }
      else
      {
        paramInt1 = paramObject instanceof ConstraintSet.Layout;
        if (paramInt1 != 0)
        {
          paramObject = (ConstraintSet.Layout)paramObject;
          if (paramInt2 == 0)
          {
            paramObject.OooO0Oo = k;
            paramObject.o00Oo0 = m;
          }
          else
          {
            paramObject.OooO0o0 = k;
            paramObject.o00Ooo = m;
          }
        }
        else
        {
          paramInt1 = paramObject instanceof ConstraintSet.Constraint.Delta;
          if (paramInt1 != 0)
          {
            paramObject = (ConstraintSet.Constraint.Delta)paramObject;
            if (paramInt2 == 0)
            {
              paramObject.OooO0O0(23, k);
              paramInt1 = 80;
            }
            else
            {
              paramObject.OooO0O0(21, k);
              paramInt1 = 81;
            }
            paramObject.OooO0Oo(paramInt1, m);
          }
        }
      }
      return;
    }
    paramTypedArray = paramTypedArray.getString(paramInt1);
    OooOoO0(paramObject, paramTypedArray, paramInt2);
  }
  
  public static int OooOo0o(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    paramInt2 = paramTypedArray.getResourceId(paramInt1, paramInt2);
    int i = -1;
    if (paramInt2 == i) {
      paramInt2 = paramTypedArray.getInt(paramInt1, i);
    }
    return paramInt2;
  }
  
  public static void OooOoO(ConstraintLayout.LayoutParams paramLayoutParams, String paramString)
  {
    float f1 = 0.0F / 0.0F;
    int i = -1;
    float f2;
    String str1;
    int i1;
    int m;
    String str5;
    if (paramString != null)
    {
      int j = paramString.length();
      f2 = 6.165713E-044F;
      k = paramString.indexOf(',');
      boolean bool1 = false;
      str1 = null;
      i1 = 1;
      if (k > 0)
      {
        int i2 = j + -1;
        if (k < i2)
        {
          String str2 = paramString.substring(0, k);
          String str3 = "W";
          boolean bool3 = str2.equalsIgnoreCase(str3);
          if (bool3)
          {
            i = 0;
          }
          else
          {
            str1 = "H";
            bool1 = str2.equalsIgnoreCase(str1);
            if (bool1) {
              i = i1;
            }
          }
          m = k + 1;
        }
      }
      f2 = 8.127531E-044F;
      k = paramString.indexOf(':');
      if (k >= 0)
      {
        j -= i1;
        if (k < j)
        {
          str4 = paramString.substring(m, k);
          k += i1;
          str5 = paramString.substring(k);
          m = str4.length();
          if (m <= 0) {
            break label303;
          }
          m = str5.length();
          if (m <= 0) {
            break label303;
          }
        }
      }
    }
    try
    {
      float f3 = Float.parseFloat(str4);
      f2 = Float.parseFloat(str5);
      m = 0;
      str1 = null;
      boolean bool2 = f3 < 0.0F;
      if (!bool2) {
        break label303;
      }
      n = f2 < 0.0F;
      if (n <= 0) {
        break label303;
      }
      if (i == i1)
      {
        f2 /= f3;
        f1 = Math.abs(f2);
      }
      else
      {
        f3 /= f2;
        f1 = Math.abs(f3);
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      int n;
      break label303;
    }
    String str4 = paramString.substring(n);
    int k = str4.length();
    if (k > 0) {
      f1 = Float.parseFloat(str4);
    }
    label303:
    paramLayoutParams.Oooo0 = paramString;
    paramLayoutParams.Oooo0O0 = f1;
    paramLayoutParams.Oooo0OO = i;
  }
  
  public static void OooOoO0(Object paramObject, String paramString, int paramInt)
  {
    if (paramString == null) {
      return;
    }
    float f1 = 8.547921E-044F;
    int i = paramString.indexOf('=');
    int k = paramString.length();
    if (i > 0)
    {
      k += -1;
      if (i < k)
      {
        k = 0;
        String str1 = paramString.substring(0, i);
        i += 1;
        paramString = paramString.substring(i);
        i = paramString.length();
        if (i > 0)
        {
          String str2 = str1.trim();
          paramString = paramString.trim();
          str1 = "ratio";
          boolean bool3 = str1.equalsIgnoreCase(str2);
          boolean bool1;
          if (bool3)
          {
            bool1 = paramObject instanceof ConstraintLayout.LayoutParams;
            if (bool1)
            {
              paramObject = (ConstraintLayout.LayoutParams)paramObject;
              if (paramInt == 0) {
                paramObject.width = 0;
              } else {
                paramObject.height = 0;
              }
              OooOoO(paramObject, paramString);
            }
            else
            {
              paramInt = paramObject instanceof ConstraintSet.Layout;
              if (paramInt != 0)
              {
                paramObject = (ConstraintSet.Layout)paramObject;
                paramObject.OooOoOO = paramString;
              }
              else
              {
                paramInt = paramObject instanceof ConstraintSet.Constraint.Delta;
                if (paramInt != 0)
                {
                  paramObject = (ConstraintSet.Constraint.Delta)paramObject;
                  paramInt = 5;
                  paramObject.OooO0OO(paramInt, paramString);
                }
              }
            }
          }
          else
          {
            str1 = "weight";
            bool3 = str1.equalsIgnoreCase(str2);
            int n = 23;
            int i1 = 21;
            if (bool3) {}
            try
            {
              float f2 = Float.parseFloat(paramString);
              bool1 = paramObject instanceof ConstraintLayout.LayoutParams;
              if (bool1)
              {
                paramObject = (ConstraintLayout.LayoutParams)paramObject;
                if (paramInt == 0)
                {
                  paramObject.width = 0;
                  paramObject.Oooo0o0 = f2;
                }
                else
                {
                  paramObject.height = 0;
                  paramObject.Oooo0o = f2;
                }
              }
              else
              {
                bool1 = paramObject instanceof ConstraintSet.Layout;
                if (bool1)
                {
                  paramObject = (ConstraintSet.Layout)paramObject;
                  if (paramInt == 0)
                  {
                    paramObject.OooO0Oo = 0;
                    paramObject.OoooOOO = f2;
                  }
                  else
                  {
                    paramObject.OooO0o0 = 0;
                    paramObject.o000oOoO = f2;
                  }
                }
                else
                {
                  bool1 = paramObject instanceof ConstraintSet.Constraint.Delta;
                  if (bool1)
                  {
                    paramObject = (ConstraintSet.Constraint.Delta)paramObject;
                    if (paramInt == 0) {
                      paramObject.OooO0O0(n, 0);
                    }
                    for (paramInt = 39;; paramInt = 40)
                    {
                      paramObject.OooO00o(paramInt, f2);
                      break;
                      paramObject.OooO0O0(i1, 0);
                    }
                    str1 = "parent";
                    bool1 = str1.equalsIgnoreCase(str2);
                    if (bool1)
                    {
                      f2 = Float.parseFloat(paramString);
                      int j = 1065353216;
                      f1 = 1.0F;
                      f2 = Math.min(f1, f2);
                      j = 0;
                      f1 = 0.0F;
                      str2 = null;
                      f2 = Math.max(0.0F, f2);
                      boolean bool2 = paramObject instanceof ConstraintLayout.LayoutParams;
                      int m = 2;
                      if (bool2)
                      {
                        paramObject = (ConstraintLayout.LayoutParams)paramObject;
                        if (paramInt == 0)
                        {
                          paramObject.width = 0;
                          paramObject.o000oOoO = f2;
                          paramObject.Oooo = m;
                        }
                        else
                        {
                          paramObject.height = 0;
                          paramObject.OoooOOO = f2;
                          paramObject.OoooO00 = m;
                        }
                      }
                      else
                      {
                        bool2 = paramObject instanceof ConstraintSet.Layout;
                        if (bool2)
                        {
                          paramObject = (ConstraintSet.Layout)paramObject;
                          if (paramInt == 0)
                          {
                            paramObject.OooO0Oo = 0;
                            paramObject.OooooOo = f2;
                            paramObject.OoooOoO = m;
                          }
                          else
                          {
                            paramObject.OooO0o0 = 0;
                            paramObject.Oooooo0 = f2;
                            paramObject.OoooOoo = m;
                          }
                        }
                        else
                        {
                          boolean bool4 = paramObject instanceof ConstraintSet.Constraint.Delta;
                          if (bool4)
                          {
                            paramObject = (ConstraintSet.Constraint.Delta)paramObject;
                            int i2;
                            if (paramInt == 0)
                            {
                              paramObject.OooO0O0(n, 0);
                              i2 = 54;
                            }
                            for (f2 = 7.567012E-044F;; f2 = 7.707142E-044F)
                            {
                              paramObject.OooO0O0(i2, m);
                              break;
                              paramObject.OooO0O0(i1, 0);
                              i2 = 55;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              return;
            }
            catch (NumberFormatException localNumberFormatException) {}
          }
        }
      }
    }
  }
  
  public static void OooOoo0(Context paramContext, ConstraintSet.Constraint paramConstraint, TypedArray paramTypedArray)
  {
    int i = paramTypedArray.getIndexCount();
    ConstraintSet.Constraint.Delta localDelta = new androidx/constraintlayout/widget/ConstraintSet$Constraint$Delta;
    localDelta.<init>();
    paramConstraint.OooO0oo = localDelta;
    paramConstraint.OooO0Oo.OooO00o = false;
    paramConstraint.OooO0o0.OooO0O0 = false;
    paramConstraint.OooO0OO.OooO00o = false;
    paramConstraint.OooO0o.OooO00o = false;
    int j = 0;
    while (j < i)
    {
      int k = paramTypedArray.getIndex(j);
      Object localObject1 = OooOO0;
      int i6 = ((SparseIntArray)localObject1).get(k);
      int i12 = 1065353216;
      float f1 = 1.0F;
      String str1 = "   ";
      int i13 = 3;
      int i14 = 1;
      int i15 = -1;
      Object localObject2;
      float f2;
      int i8;
      Object localObject3;
      label702:
      int n;
      label1147:
      float f3;
      int i1;
      int i2;
      int i10;
      int i3;
      int i4;
      int i11;
      int i5;
      switch (i6)
      {
      case 3: 
      case 4: 
      case 9: 
      case 10: 
      case 25: 
      case 26: 
      case 29: 
      case 30: 
      case 32: 
      case 33: 
      case 35: 
      case 36: 
      case 61: 
      case 88: 
      case 89: 
      case 90: 
      case 91: 
      case 92: 
      default: 
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
      case 99: 
      case 98: 
      case 97: 
      case 96: 
      case 95: 
      case 94: 
      case 93: 
      case 87: 
        for (localObject2 = "Unknown attribute 0x";; localObject2 = "unused attribute 0x")
        {
          ((StringBuilder)localObject1).append((String)localObject2);
          localObject2 = Integer.toHexString(k);
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(str1);
          localObject2 = OooO;
          k = ((SparseIntArray)localObject2).get(k);
          ((StringBuilder)localObject1).append(k);
          break label3600;
          localObject1 = paramConstraint.OooO0o0;
          boolean bool1 = ((ConstraintSet.Layout)localObject1).OooO;
          int m = paramTypedArray.getBoolean(k, bool1);
          int i7 = 99;
          f2 = 1.387286E-043F;
          break;
          boolean bool2 = MotionLayout.o00oo0O;
          if (bool2)
          {
            i8 = paramConstraint.OooO00o;
            i8 = paramTypedArray.getResourceId(m, i8);
            paramConstraint.OooO00o = i8;
            if (i8 != i15) {
              break label3600;
            }
          }
          else
          {
            localObject1 = paramTypedArray.peekValue(m);
            i8 = ((TypedValue)localObject1).type;
            if (i8 != i13) {
              break label702;
            }
          }
          localObject3 = paramTypedArray.getString(m);
          paramConstraint.OooO0O0 = ((String)localObject3);
          break label3600;
          i8 = paramConstraint.OooO00o;
          n = paramTypedArray.getResourceId(m, i8);
          paramConstraint.OooO00o = n;
          break label3600;
          localObject1 = paramConstraint.OooO0o0;
          i8 = ((ConstraintSet.Layout)localObject1).o00ooo;
          n = paramTypedArray.getInt(n, i8);
          i8 = 97;
          f2 = 1.35926E-043F;
          break label3591;
          OooOo(localDelta, paramTypedArray, n, i14);
          break label3600;
          OooOo(localDelta, paramTypedArray, n, 0);
          break label3600;
          localObject1 = paramConstraint.OooO0o0;
          i8 = ((ConstraintSet.Layout)localObject1).OoooOO0;
          n = paramTypedArray.getDimensionPixelSize(n, i8);
          i8 = 94;
          f2 = 1.317221E-043F;
          break label3591;
          localObject1 = paramConstraint.OooO0o0;
          i8 = ((ConstraintSet.Layout)localObject1).Oooo0oO;
          n = paramTypedArray.getDimensionPixelSize(n, i8);
          i8 = 93;
          f2 = 1.303208E-043F;
          break label3591;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
        }
      case 86: 
        localObject1 = paramTypedArray.peekValue(n);
        i8 = ((TypedValue)localObject1).type;
        i12 = -2;
        f1 = 0.0F / 0.0F;
        int i16 = 89;
        int i17 = 88;
        if (i8 == i14)
        {
          localObject1 = paramConstraint.OooO0Oo;
          n = paramTypedArray.getResourceId(n, i15);
          ((ConstraintSet.Motion)localObject1).OooOOO = n;
          n = paramConstraint.OooO0Oo.OooOOO;
          localDelta.OooO0O0(i16, n);
          localObject3 = paramConstraint.OooO0Oo;
          i8 = ((ConstraintSet.Motion)localObject3).OooOOO;
          if (i8 == i15) {}
        }
        else
        {
          for (;;)
          {
            ((ConstraintSet.Motion)localObject3).OooOOO0 = i12;
            localDelta.OooO0O0(i17, i12);
            break label3600;
            if (i8 != i13) {
              break label1147;
            }
            localObject1 = paramConstraint.OooO0Oo;
            String str2 = paramTypedArray.getString(n);
            ((ConstraintSet.Motion)localObject1).OooOO0o = str2;
            localObject1 = paramConstraint.OooO0Oo.OooOO0o;
            i13 = 90;
            localDelta.OooO0OO(i13, (String)localObject1);
            localObject1 = paramConstraint.OooO0Oo.OooOO0o;
            str2 = "/";
            i8 = ((String)localObject1).indexOf(str2);
            if (i8 <= 0) {
              break;
            }
            localObject1 = paramConstraint.OooO0Oo;
            n = paramTypedArray.getResourceId(n, i15);
            ((ConstraintSet.Motion)localObject1).OooOOO = n;
            n = paramConstraint.OooO0Oo.OooOOO;
            localDelta.OooO0O0(i16, n);
            localObject3 = paramConstraint.OooO0Oo;
          }
          localObject3 = paramConstraint.OooO0Oo;
          ((ConstraintSet.Motion)localObject3).OooOOO0 = i15;
          localDelta.OooO0O0(i17, i15);
          break label3600;
          localObject1 = paramConstraint.OooO0Oo;
          i12 = ((ConstraintSet.Motion)localObject1).OooOOO;
          n = paramTypedArray.getInteger(n, i12);
          ((ConstraintSet.Motion)localObject1).OooOOO0 = n;
          localObject3 = paramConstraint.OooO0Oo;
          n = ((ConstraintSet.Motion)localObject3).OooOOO0;
          localDelta.OooO0O0(i17, n);
        }
        break;
      case 85: 
        localObject1 = paramConstraint.OooO0Oo;
        f2 = ((ConstraintSet.Motion)localObject1).OooOO0;
        f3 = paramTypedArray.getFloat(n, f2);
        i8 = 85;
        f2 = 1.191104E-043F;
        break;
      case 84: 
        localObject1 = paramConstraint.OooO0Oo;
        i8 = ((ConstraintSet.Motion)localObject1).OooOO0O;
        n = paramTypedArray.getInteger(n, i8);
        i8 = 84;
        f2 = 1.177091E-043F;
        break;
      case 83: 
        localObject1 = paramConstraint.OooO0o;
        i8 = ((ConstraintSet.Transform)localObject1).OooO;
        n = OooOo0o(paramTypedArray, n, i8);
        i8 = 83;
        f2 = 1.163078E-043F;
        break;
      case 82: 
        localObject1 = paramConstraint.OooO0Oo;
        i8 = ((ConstraintSet.Motion)localObject1).OooO0OO;
        n = paramTypedArray.getInteger(n, i8);
        i8 = 82;
        f2 = 1.149065E-043F;
        break;
      case 81: 
        localObject1 = paramConstraint.OooO0o0;
        boolean bool3 = ((ConstraintSet.Layout)localObject1).o00Ooo;
        i1 = paramTypedArray.getBoolean(n, bool3);
        int i9 = 81;
        f2 = 1.135052E-043F;
        break;
      case 80: 
        localObject1 = paramConstraint.OooO0o0;
        boolean bool4 = ((ConstraintSet.Layout)localObject1).o00Oo0;
        i2 = paramTypedArray.getBoolean(i1, bool4);
        i10 = 80;
        f2 = 1.121039E-043F;
        break;
      case 79: 
        localObject1 = paramConstraint.OooO0Oo;
        f2 = ((ConstraintSet.Motion)localObject1).OooO0oO;
        f3 = paramTypedArray.getFloat(i2, f2);
        i10 = 79;
        f2 = 1.107026E-043F;
        break;
      case 78: 
        localObject1 = paramConstraint.OooO0OO;
        i10 = ((ConstraintSet.PropertySet)localObject1).OooO0OO;
        i3 = paramTypedArray.getInt(i2, i10);
        i10 = 78;
        f2 = 1.093013E-043F;
        break;
      case 77: 
        i10 = 77;
        f2 = 1.079E-043F;
        break;
      case 76: 
        localObject1 = paramConstraint.OooO0Oo;
        i10 = ((ConstraintSet.Motion)localObject1).OooO0o0;
        i3 = paramTypedArray.getInt(i3, i10);
        i10 = 76;
        f2 = 1.064987E-043F;
        break;
      case 75: 
        localObject1 = paramConstraint.OooO0o0;
        boolean bool5 = ((ConstraintSet.Layout)localObject1).o00o0O;
        i4 = paramTypedArray.getBoolean(i3, bool5);
        i11 = 75;
        f2 = 1.050974E-043F;
        localDelta.OooO0Oo(i11, i4);
        break;
      case 74: 
        i11 = 74;
        f2 = 1.036961E-043F;
        break;
      case 73: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OoooooO;
        i5 = paramTypedArray.getDimensionPixelSize(i4, i11);
        i11 = 73;
        f2 = 1.022948E-043F;
        break;
      case 72: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).Oooooo;
        i5 = paramTypedArray.getInt(i5, i11);
        i11 = 72;
        f2 = 1.008935E-043F;
        break;
      case 70: 
        i11 = 70;
        f2 = 9.809089E-044F;
        break;
      case 69: 
        i11 = 69;
        f2 = 9.668959E-044F;
        f3 = paramTypedArray.getFloat(i5, f1);
        break;
      case 68: 
        localObject1 = paramConstraint.OooO0OO;
        f2 = ((ConstraintSet.PropertySet)localObject1).OooO0o0;
        f3 = paramTypedArray.getFloat(i5, f2);
        i11 = 68;
        f2 = 9.52883E-044F;
        break;
      case 67: 
        localObject1 = paramConstraint.OooO0Oo;
        f2 = ((ConstraintSet.Motion)localObject1).OooO;
        f3 = paramTypedArray.getFloat(i5, f2);
        i11 = 67;
        f2 = 9.3887E-044F;
        break;
      case 66: 
        i11 = 66;
        f2 = 9.24857E-044F;
        i5 = paramTypedArray.getInt(i5, 0);
        break;
      case 65: 
        localObject1 = paramTypedArray.peekValue(i5);
        i11 = ((TypedValue)localObject1).type;
        i12 = 65;
        f1 = 9.10844E-044F;
        if (i11 == i13)
        {
          localObject3 = paramTypedArray.getString(i5);
        }
        else
        {
          localObject1 = Easing.OooO0OO;
          i5 = paramTypedArray.getInteger(i5, 0);
          localObject3 = localObject1[i5];
        }
        localDelta.OooO0OO(i12, (String)localObject3);
        break;
      case 64: 
        localObject1 = paramConstraint.OooO0Oo;
        i11 = ((ConstraintSet.Motion)localObject1).OooO0O0;
        i5 = OooOo0o(paramTypedArray, i5, i11);
        i11 = 64;
        f2 = 8.96831E-044F;
        break;
      case 63: 
        localObject1 = paramConstraint.OooO0o0;
        f2 = ((ConstraintSet.Layout)localObject1).OooOooO;
        f3 = paramTypedArray.getFloat(i5, f2);
        i11 = 63;
        f2 = 8.82818E-044F;
        break;
      case 62: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OooOoo;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 62;
        f2 = 8.688051E-044F;
        break;
      case 60: 
        localObject1 = paramConstraint.OooO0o;
        f2 = ((ConstraintSet.Transform)localObject1).OooO0O0;
        f3 = paramTypedArray.getFloat(i5, f2);
        i11 = 60;
        f2 = 8.407791E-044F;
        break;
      case 59: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OooooOO;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 59;
        f2 = 8.267661E-044F;
        break;
      case 58: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OooooO0;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 58;
        f2 = 8.127531E-044F;
        break;
      case 57: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).Ooooo0o;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 57;
        f2 = 7.987401E-044F;
        break;
      case 56: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).Ooooo00;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 56;
        f2 = 7.847271E-044F;
        break;
      case 55: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OoooOoo;
        i5 = paramTypedArray.getInt(i5, i11);
        i11 = 55;
        f2 = 7.707142E-044F;
        break;
      case 54: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OoooOoO;
        i5 = paramTypedArray.getInt(i5, i11);
        i11 = 54;
        f2 = 7.567012E-044F;
        break;
      case 53: 
        localObject1 = paramConstraint.OooO0o;
        f2 = ((ConstraintSet.Transform)localObject1).OooOO0o;
        f3 = paramTypedArray.getDimension(i5, f2);
        i11 = 53;
        f2 = 7.426882E-044F;
        break;
      case 52: 
        localObject1 = paramConstraint.OooO0o;
        f2 = ((ConstraintSet.Transform)localObject1).OooOO0O;
        f3 = paramTypedArray.getDimension(i5, f2);
        i11 = 52;
        f2 = 7.286752E-044F;
        break;
      case 51: 
        localObject1 = paramConstraint.OooO0o;
        f2 = ((ConstraintSet.Transform)localObject1).OooOO0;
        f3 = paramTypedArray.getDimension(i5, f2);
        i11 = 51;
        f2 = 7.146622E-044F;
        break;
      case 50: 
        localObject1 = paramConstraint.OooO0o;
        f2 = ((ConstraintSet.Transform)localObject1).OooO0oo;
        f3 = paramTypedArray.getDimension(i5, f2);
        i11 = 50;
        f2 = 7.006492E-044F;
        break;
      case 49: 
        localObject1 = paramConstraint.OooO0o;
        f2 = ((ConstraintSet.Transform)localObject1).OooO0oO;
        f3 = paramTypedArray.getDimension(i5, f2);
        i11 = 49;
        f2 = 6.866363E-044F;
        break;
      case 48: 
        localObject1 = paramConstraint.OooO0o;
        f2 = ((ConstraintSet.Transform)localObject1).OooO0o;
        f3 = paramTypedArray.getFloat(i5, f2);
        i11 = 48;
        f2 = 6.726233E-044F;
        break;
      case 47: 
        localObject1 = paramConstraint.OooO0o;
        f2 = ((ConstraintSet.Transform)localObject1).OooO0o0;
        f3 = paramTypedArray.getFloat(i5, f2);
        i11 = 47;
        f2 = 6.586103E-044F;
        break;
      case 46: 
        localObject1 = paramConstraint.OooO0o;
        f2 = ((ConstraintSet.Transform)localObject1).OooO0Oo;
        f3 = paramTypedArray.getFloat(i5, f2);
        i11 = 46;
        f2 = 6.445973E-044F;
        break;
      case 45: 
        localObject1 = paramConstraint.OooO0o;
        f2 = ((ConstraintSet.Transform)localObject1).OooO0OO;
        f3 = paramTypedArray.getFloat(i5, f2);
        i11 = 45;
        f2 = 6.305843E-044F;
        break;
      case 44: 
        i11 = 44;
        f2 = 6.165713E-044F;
        localDelta.OooO0Oo(i11, i14);
        localObject2 = paramConstraint.OooO0o;
        f1 = ((ConstraintSet.Transform)localObject2).OooOOO;
        f3 = paramTypedArray.getDimension(i5, f1);
        break;
      case 43: 
        localObject1 = paramConstraint.OooO0OO;
        f2 = ((ConstraintSet.PropertySet)localObject1).OooO0Oo;
        f3 = paramTypedArray.getFloat(i5, f2);
        i11 = 43;
        f2 = 6.025583E-044F;
        break;
      case 42: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OoooOo0;
        i5 = paramTypedArray.getInt(i5, i11);
        i11 = 42;
        f2 = 5.885454E-044F;
        break;
      case 41: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OoooOOo;
        i5 = paramTypedArray.getInt(i5, i11);
        i11 = 41;
        f2 = 5.745324E-044F;
        break;
      case 40: 
        localObject1 = paramConstraint.OooO0o0;
        f2 = ((ConstraintSet.Layout)localObject1).o000oOoO;
        f3 = paramTypedArray.getFloat(i5, f2);
        i11 = 40;
        f2 = 5.605194E-044F;
        break;
      case 39: 
        localObject1 = paramConstraint.OooO0o0;
        f2 = ((ConstraintSet.Layout)localObject1).OoooOOO;
        f3 = paramTypedArray.getFloat(i5, f2);
        i11 = 39;
        f2 = 5.465064E-044F;
        break;
      case 38: 
        i11 = paramConstraint.OooO00o;
        i5 = paramTypedArray.getResourceId(i5, i11);
        paramConstraint.OooO00o = i5;
        i11 = 38;
        f2 = 5.324934E-044F;
        break;
      case 37: 
        localObject1 = paramConstraint.OooO0o0;
        f2 = ((ConstraintSet.Layout)localObject1).OooOoO;
        f3 = paramTypedArray.getFloat(i5, f2);
        i11 = 37;
        f2 = 5.184804E-044F;
        break;
      case 34: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).Oooo0O0;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 34;
        f2 = 4.764415E-044F;
        break;
      case 31: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).Oooo0o;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 31;
        f2 = 4.344025E-044F;
        break;
      case 28: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).Oooo0;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 28;
        f2 = 3.923636E-044F;
        break;
      case 27: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).Oooo00O;
        i5 = paramTypedArray.getInt(i5, i11);
        i11 = 27;
        f2 = 3.783506E-044F;
        break;
      case 24: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).Oooo00o;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 24;
        f2 = 3.363116E-044F;
        break;
      case 23: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OooO0Oo;
        i5 = paramTypedArray.getLayoutDimension(i5, i11);
        i11 = 23;
        f2 = 3.222987E-044F;
        break;
      case 22: 
        localObject1 = OooO0oo;
        localObject2 = paramConstraint.OooO0OO;
        i12 = ((ConstraintSet.PropertySet)localObject2).OooO0O0;
        i5 = paramTypedArray.getInt(i5, i12);
        i5 = localObject1[i5];
        i11 = 22;
        f2 = 3.082857E-044F;
        break;
      case 21: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OooO0o0;
        i5 = paramTypedArray.getLayoutDimension(i5, i11);
        i11 = 21;
        f2 = 2.942727E-044F;
        break;
      case 20: 
        localObject1 = paramConstraint.OooO0o0;
        f2 = ((ConstraintSet.Layout)localObject1).OooOoO0;
        f3 = paramTypedArray.getFloat(i5, f2);
        i11 = 20;
        f2 = 2.802597E-044F;
        break;
      case 19: 
        localObject1 = paramConstraint.OooO0o0;
        f2 = ((ConstraintSet.Layout)localObject1).OooO0oo;
        f3 = paramTypedArray.getFloat(i5, f2);
        i11 = 19;
        f2 = 2.662467E-044F;
        localDelta.OooO00o(i11, f3);
        break;
      case 18: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OooO0oO;
        i5 = paramTypedArray.getDimensionPixelOffset(i5, i11);
        i11 = 18;
        f2 = 2.522337E-044F;
        break;
      case 17: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OooO0o;
        i5 = paramTypedArray.getDimensionPixelOffset(i5, i11);
        i11 = 17;
        f2 = 2.382207E-044F;
        break;
      case 16: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).Oooo;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 16;
        f2 = 2.242078E-044F;
        break;
      case 15: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OoooO;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 15;
        f2 = 2.101948E-044F;
        break;
      case 14: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OoooO00;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 14;
        f2 = 1.961818E-044F;
        break;
      case 13: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).Oooo0oo;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 13;
        f2 = 1.821688E-044F;
        break;
      case 12: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OoooO0O;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 12;
        f2 = 1.681558E-044F;
        break;
      case 11: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OoooO0;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 11;
        f2 = 1.541428E-044F;
        break;
      case 8: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).Oooo0o0;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 8;
        f2 = 1.121039E-044F;
        break;
      case 7: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).Oooo000;
        i5 = paramTypedArray.getDimensionPixelOffset(i5, i11);
        i11 = 7;
        f2 = 9.809089E-045F;
        break;
      case 6: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).OooOooo;
        i5 = paramTypedArray.getDimensionPixelOffset(i5, i11);
        i11 = 6;
        f2 = 8.407791E-045F;
        break;
      case 5: 
        i11 = 5;
        f2 = 7.006492E-045F;
        localObject3 = paramTypedArray.getString(i5);
        localDelta.OooO0OO(i11, (String)localObject3);
        break;
      case 2: 
        localObject1 = paramConstraint.OooO0o0;
        i11 = ((ConstraintSet.Layout)localObject1).Oooo0OO;
        i5 = paramTypedArray.getDimensionPixelSize(i5, i11);
        i11 = 2;
        f2 = 2.802597E-045F;
        label3591:
        localDelta.OooO0O0(i11, i5);
      }
      label3600:
      j += 1;
    }
  }
  
  public static void OooOooo(ConstraintSet.Constraint paramConstraint, int paramInt, float paramFloat)
  {
    int i = 19;
    if (paramInt != i)
    {
      i = 20;
      if (paramInt != i)
      {
        i = 37;
        if (paramInt != i)
        {
          i = 60;
          if (paramInt != i)
          {
            i = 63;
            if (paramInt != i)
            {
              i = 79;
              if (paramInt != i)
              {
                i = 85;
                if (paramInt != i)
                {
                  i = 39;
                  if (paramInt != i)
                  {
                    i = 40;
                    if (paramInt != i)
                    {
                      switch (paramInt)
                      {
                      default: 
                        switch (paramInt)
                        {
                        default: 
                          break;
                        case 70: 
                          paramConstraint = paramConstraint.OooO0o0;
                          paramConstraint.Oooooo0 = paramFloat;
                          break;
                        case 69: 
                          paramConstraint = paramConstraint.OooO0o0;
                          paramConstraint.OooooOo = paramFloat;
                          break;
                        case 68: 
                          paramConstraint = paramConstraint.OooO0OO;
                          paramConstraint.OooO0o0 = paramFloat;
                          break;
                        case 67: 
                          paramConstraint = paramConstraint.OooO0Oo;
                          paramConstraint.OooO = paramFloat;
                        }
                        break;
                      case 53: 
                        paramConstraint = paramConstraint.OooO0o;
                        paramConstraint.OooOO0o = paramFloat;
                        break;
                      case 52: 
                        paramConstraint = paramConstraint.OooO0o;
                        paramConstraint.OooOO0O = paramFloat;
                        break;
                      case 51: 
                        paramConstraint = paramConstraint.OooO0o;
                        paramConstraint.OooOO0 = paramFloat;
                        break;
                      case 50: 
                        paramConstraint = paramConstraint.OooO0o;
                        paramConstraint.OooO0oo = paramFloat;
                        break;
                      case 49: 
                        paramConstraint = paramConstraint.OooO0o;
                        paramConstraint.OooO0oO = paramFloat;
                        break;
                      case 48: 
                        paramConstraint = paramConstraint.OooO0o;
                        paramConstraint.OooO0o = paramFloat;
                        break;
                      case 47: 
                        paramConstraint = paramConstraint.OooO0o;
                        paramConstraint.OooO0o0 = paramFloat;
                        break;
                      case 46: 
                        paramConstraint = paramConstraint.OooO0o;
                        paramConstraint.OooO0Oo = paramFloat;
                        break;
                      case 45: 
                        paramConstraint = paramConstraint.OooO0o;
                        paramConstraint.OooO0OO = paramFloat;
                        break;
                      case 44: 
                        paramConstraint = paramConstraint.OooO0o;
                        paramConstraint.OooOOO = paramFloat;
                        paramInt = 1;
                        paramConstraint.OooOOO0 = paramInt;
                        break;
                      case 43: 
                        paramConstraint = paramConstraint.OooO0OO;
                        paramConstraint.OooO0Oo = paramFloat;
                        break;
                      }
                    }
                    else
                    {
                      paramConstraint = paramConstraint.OooO0o0;
                      paramConstraint.o000oOoO = paramFloat;
                    }
                  }
                  else
                  {
                    paramConstraint = paramConstraint.OooO0o0;
                    paramConstraint.OoooOOO = paramFloat;
                  }
                }
                else
                {
                  paramConstraint = paramConstraint.OooO0Oo;
                  paramConstraint.OooOO0 = paramFloat;
                }
              }
              else
              {
                paramConstraint = paramConstraint.OooO0Oo;
                paramConstraint.OooO0oO = paramFloat;
              }
            }
            else
            {
              paramConstraint = paramConstraint.OooO0o0;
              paramConstraint.OooOooO = paramFloat;
            }
          }
          else
          {
            paramConstraint = paramConstraint.OooO0o;
            paramConstraint.OooO0O0 = paramFloat;
          }
        }
        else
        {
          paramConstraint = paramConstraint.OooO0o0;
          paramConstraint.OooOoO = paramFloat;
        }
      }
      else
      {
        paramConstraint = paramConstraint.OooO0o0;
        paramConstraint.OooOoO0 = paramFloat;
      }
    }
    else
    {
      paramConstraint = paramConstraint.OooO0o0;
      paramConstraint.OooO0oo = paramFloat;
    }
  }
  
  public static void Oooo000(ConstraintSet.Constraint paramConstraint, int paramInt1, int paramInt2)
  {
    int i = 6;
    if (paramInt1 != i)
    {
      i = 7;
      if (paramInt1 != i)
      {
        i = 8;
        if (paramInt1 != i)
        {
          i = 27;
          if (paramInt1 != i)
          {
            i = 28;
            if (paramInt1 != i)
            {
              i = 41;
              if (paramInt1 != i)
              {
                i = 42;
                if (paramInt1 != i)
                {
                  i = 61;
                  if (paramInt1 != i)
                  {
                    i = 62;
                    if (paramInt1 != i)
                    {
                      i = 72;
                      if (paramInt1 != i)
                      {
                        i = 73;
                        if (paramInt1 != i)
                        {
                          i = 88;
                          if (paramInt1 != i)
                          {
                            i = 89;
                            if (paramInt1 != i)
                            {
                              switch (paramInt1)
                              {
                              default: 
                                switch (paramInt1)
                                {
                                default: 
                                  switch (paramInt1)
                                  {
                                  default: 
                                    switch (paramInt1)
                                    {
                                    default: 
                                      break;
                                    case 84: 
                                      paramConstraint = paramConstraint.OooO0Oo;
                                      paramConstraint.OooOO0O = paramInt2;
                                      break;
                                    case 83: 
                                      paramConstraint = paramConstraint.OooO0o;
                                      paramConstraint.OooO = paramInt2;
                                      break;
                                    case 82: 
                                      paramConstraint = paramConstraint.OooO0Oo;
                                      paramConstraint.OooO0OO = paramInt2;
                                    }
                                    break;
                                  case 59: 
                                    paramConstraint = paramConstraint.OooO0o0;
                                    paramConstraint.OooooOO = paramInt2;
                                    break;
                                  case 58: 
                                    paramConstraint = paramConstraint.OooO0o0;
                                    paramConstraint.OooooO0 = paramInt2;
                                    break;
                                  case 57: 
                                    paramConstraint = paramConstraint.OooO0o0;
                                    paramConstraint.Ooooo0o = paramInt2;
                                    break;
                                  case 56: 
                                    paramConstraint = paramConstraint.OooO0o0;
                                    paramConstraint.Ooooo00 = paramInt2;
                                    break;
                                  case 55: 
                                    paramConstraint = paramConstraint.OooO0o0;
                                    paramConstraint.OoooOoo = paramInt2;
                                    break;
                                  case 54: 
                                    paramConstraint = paramConstraint.OooO0o0;
                                    paramConstraint.OoooOoO = paramInt2;
                                  }
                                  break;
                                case 24: 
                                  paramConstraint = paramConstraint.OooO0o0;
                                  paramConstraint.Oooo00o = paramInt2;
                                  break;
                                case 23: 
                                  paramConstraint = paramConstraint.OooO0o0;
                                  paramConstraint.OooO0Oo = paramInt2;
                                  break;
                                case 22: 
                                  paramConstraint = paramConstraint.OooO0OO;
                                  paramConstraint.OooO0O0 = paramInt2;
                                  break;
                                case 21: 
                                  paramConstraint = paramConstraint.OooO0o0;
                                  paramConstraint.OooO0o0 = paramInt2;
                                }
                                break;
                              case 97: 
                                paramConstraint = paramConstraint.OooO0o0;
                                paramConstraint.o00ooo = paramInt2;
                                break;
                              case 94: 
                                paramConstraint = paramConstraint.OooO0o0;
                                paramConstraint.OoooOO0 = paramInt2;
                                break;
                              case 93: 
                                paramConstraint = paramConstraint.OooO0o0;
                                paramConstraint.Oooo0oO = paramInt2;
                                break;
                              case 78: 
                                paramConstraint = paramConstraint.OooO0OO;
                                paramConstraint.OooO0OO = paramInt2;
                                break;
                              case 76: 
                                paramConstraint = paramConstraint.OooO0Oo;
                                paramConstraint.OooO0o0 = paramInt2;
                                break;
                              case 66: 
                                paramConstraint = paramConstraint.OooO0Oo;
                                paramConstraint.OooO0o = paramInt2;
                                break;
                              case 64: 
                                paramConstraint = paramConstraint.OooO0Oo;
                                paramConstraint.OooO0O0 = paramInt2;
                                break;
                              case 38: 
                                paramConstraint.OooO00o = paramInt2;
                                break;
                              case 34: 
                                paramConstraint = paramConstraint.OooO0o0;
                                paramConstraint.Oooo0O0 = paramInt2;
                                break;
                              case 31: 
                                paramConstraint = paramConstraint.OooO0o0;
                                paramConstraint.Oooo0o = paramInt2;
                                break;
                              case 18: 
                                paramConstraint = paramConstraint.OooO0o0;
                                paramConstraint.OooO0oO = paramInt2;
                                break;
                              case 17: 
                                paramConstraint = paramConstraint.OooO0o0;
                                paramConstraint.OooO0o = paramInt2;
                                break;
                              case 16: 
                                paramConstraint = paramConstraint.OooO0o0;
                                paramConstraint.Oooo = paramInt2;
                                break;
                              case 15: 
                                paramConstraint = paramConstraint.OooO0o0;
                                paramConstraint.OoooO = paramInt2;
                                break;
                              case 14: 
                                paramConstraint = paramConstraint.OooO0o0;
                                paramConstraint.OoooO00 = paramInt2;
                                break;
                              case 13: 
                                paramConstraint = paramConstraint.OooO0o0;
                                paramConstraint.Oooo0oo = paramInt2;
                                break;
                              case 12: 
                                paramConstraint = paramConstraint.OooO0o0;
                                paramConstraint.OoooO0O = paramInt2;
                                break;
                              case 11: 
                                paramConstraint = paramConstraint.OooO0o0;
                                paramConstraint.OoooO0 = paramInt2;
                                break;
                              case 2: 
                                paramConstraint = paramConstraint.OooO0o0;
                                paramConstraint.Oooo0OO = paramInt2;
                                break;
                              }
                            }
                            else
                            {
                              paramConstraint = paramConstraint.OooO0Oo;
                              paramConstraint.OooOOO = paramInt2;
                            }
                          }
                          else
                          {
                            paramConstraint = paramConstraint.OooO0Oo;
                            paramConstraint.OooOOO0 = paramInt2;
                          }
                        }
                        else
                        {
                          paramConstraint = paramConstraint.OooO0o0;
                          paramConstraint.OoooooO = paramInt2;
                        }
                      }
                      else
                      {
                        paramConstraint = paramConstraint.OooO0o0;
                        paramConstraint.Oooooo = paramInt2;
                      }
                    }
                    else
                    {
                      paramConstraint = paramConstraint.OooO0o0;
                      paramConstraint.OooOoo = paramInt2;
                    }
                  }
                  else
                  {
                    paramConstraint = paramConstraint.OooO0o0;
                    paramConstraint.OooOoo0 = paramInt2;
                  }
                }
                else
                {
                  paramConstraint = paramConstraint.OooO0o0;
                  paramConstraint.OoooOo0 = paramInt2;
                }
              }
              else
              {
                paramConstraint = paramConstraint.OooO0o0;
                paramConstraint.OoooOOo = paramInt2;
              }
            }
            else
            {
              paramConstraint = paramConstraint.OooO0o0;
              paramConstraint.Oooo0 = paramInt2;
            }
          }
          else
          {
            paramConstraint = paramConstraint.OooO0o0;
            paramConstraint.Oooo00O = paramInt2;
          }
        }
        else
        {
          paramConstraint = paramConstraint.OooO0o0;
          paramConstraint.Oooo0o0 = paramInt2;
        }
      }
      else
      {
        paramConstraint = paramConstraint.OooO0o0;
        paramConstraint.Oooo000 = paramInt2;
      }
    }
    else
    {
      paramConstraint = paramConstraint.OooO0o0;
      paramConstraint.OooOooo = paramInt2;
    }
  }
  
  public static void Oooo00O(ConstraintSet.Constraint paramConstraint, int paramInt, String paramString)
  {
    int i = 5;
    if (paramInt != i)
    {
      i = 65;
      if (paramInt != i)
      {
        i = 74;
        if (paramInt != i)
        {
          i = 77;
          if (paramInt != i)
          {
            i = 90;
            if (paramInt == i)
            {
              paramConstraint = paramConstraint.OooO0Oo;
              paramConstraint.OooOO0o = paramString;
            }
          }
          else
          {
            paramConstraint = paramConstraint.OooO0o0;
            paramConstraint.o00O0O = paramString;
          }
        }
        else
        {
          paramConstraint = paramConstraint.OooO0o0;
          paramConstraint.ooOO = paramString;
          paramInt = 0;
          paramConstraint.o0OoOo0 = null;
        }
      }
      else
      {
        paramConstraint = paramConstraint.OooO0Oo;
        paramConstraint.OooO0Oo = paramString;
      }
    }
    else
    {
      paramConstraint = paramConstraint.OooO0o0;
      paramConstraint.OooOoOO = paramString;
    }
  }
  
  public static void Oooo00o(ConstraintSet.Constraint paramConstraint, int paramInt, boolean paramBoolean)
  {
    int i = 44;
    if (paramInt != i)
    {
      i = 75;
      if (paramInt != i)
      {
        i = 80;
        if (paramInt != i)
        {
          i = 81;
          if (paramInt == i)
          {
            paramConstraint = paramConstraint.OooO0o0;
            paramConstraint.o00Ooo = paramBoolean;
          }
        }
        else
        {
          paramConstraint = paramConstraint.OooO0o0;
          paramConstraint.o00Oo0 = paramBoolean;
        }
      }
      else
      {
        paramConstraint = paramConstraint.OooO0o0;
        paramConstraint.o00o0O = paramBoolean;
      }
    }
    else
    {
      paramConstraint = paramConstraint.OooO0o;
      paramConstraint.OooOOO0 = paramBoolean;
    }
  }
  
  private ConstraintSet.Constraint get(int paramInt)
  {
    HashMap localHashMap = this.OooO0oO;
    Integer localInteger1 = Integer.valueOf(paramInt);
    boolean bool = localHashMap.containsKey(localInteger1);
    if (!bool)
    {
      localHashMap = this.OooO0oO;
      localInteger1 = Integer.valueOf(paramInt);
      ConstraintSet.Constraint localConstraint = new androidx/constraintlayout/widget/ConstraintSet$Constraint;
      localConstraint.<init>();
      localHashMap.put(localInteger1, localConstraint);
    }
    localHashMap = this.OooO0oO;
    Integer localInteger2 = Integer.valueOf(paramInt);
    return (ConstraintSet.Constraint)localHashMap.get(localInteger2);
  }
  
  public static String getDebugName(int paramInt)
  {
    Field[] arrayOfField = ConstraintSet.class.getDeclaredFields();
    int i = arrayOfField.length;
    int j = 0;
    while (j < i)
    {
      Field localField = arrayOfField[j];
      Object localObject1 = localField.getName();
      Object localObject2 = "_";
      boolean bool = ((String)localObject1).contains((CharSequence)localObject2);
      if (bool)
      {
        localObject1 = localField.getType();
        localObject2 = Integer.TYPE;
        if (localObject1 == localObject2)
        {
          bool = Modifier.isStatic(localField.getModifiers());
          if (bool)
          {
            bool = Modifier.isFinal(localField.getModifiers());
            if (bool)
            {
              bool = false;
              localObject1 = null;
              try
              {
                int k = localField.getInt(null);
                if (k == paramInt) {
                  return localField.getName();
                }
              }
              catch (IllegalAccessException localIllegalAccessException)
              {
                localIllegalAccessException.printStackTrace();
              }
            }
          }
        }
      }
      j += 1;
    }
    return "UNKNOWN";
  }
  
  public void OooO(ConstraintLayout paramConstraintLayout)
  {
    OooOO0O(paramConstraintLayout, true);
    paramConstraintLayout.setConstraintSet(null);
    paramConstraintLayout.requestLayout();
  }
  
  public void OooO0oO(ConstraintLayout paramConstraintLayout)
  {
    int i = paramConstraintLayout.getChildCount();
    int j = 0;
    while (j < i)
    {
      Object localObject1 = paramConstraintLayout.getChildAt(j);
      int k = ((View)localObject1).getId();
      Object localObject2 = this.OooO0oO;
      Integer localInteger = Integer.valueOf(k);
      boolean bool1 = ((HashMap)localObject2).containsKey(localInteger);
      Object localObject3;
      if (!bool1)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject2 = "id unknown ";
        ((StringBuilder)localObject3).append((String)localObject2);
        localObject1 = Debug.OooO0O0((View)localObject1);
        ((StringBuilder)localObject3).append((String)localObject1);
      }
      else
      {
        bool1 = this.OooO0o;
        if (bool1)
        {
          int m = -1;
          if (k == m)
          {
            paramConstraintLayout = new java/lang/RuntimeException;
            paramConstraintLayout.<init>("All children of ConstraintLayout must have ids to use ConstraintSet");
            throw paramConstraintLayout;
          }
        }
        localObject2 = this.OooO0oO;
        localInteger = Integer.valueOf(k);
        boolean bool2 = ((HashMap)localObject2).containsKey(localInteger);
        if (bool2)
        {
          localObject2 = this.OooO0oO;
          localObject3 = Integer.valueOf(k);
          localObject3 = (ConstraintSet.Constraint)((HashMap)localObject2).get(localObject3);
          if (localObject3 != null)
          {
            localObject3 = ((ConstraintSet.Constraint)localObject3).OooO0oO;
            ConstraintAttribute.OooO0oO((View)localObject1, (HashMap)localObject3);
          }
        }
      }
      j += 1;
    }
  }
  
  public void OooO0oo(ConstraintSet paramConstraintSet)
  {
    paramConstraintSet = paramConstraintSet.OooO0oO.values().iterator();
    for (;;)
    {
      boolean bool1 = paramConstraintSet.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject1 = (ConstraintSet.Constraint)paramConstraintSet.next();
      Object localObject2 = ((ConstraintSet.Constraint)localObject1).OooO0oo;
      if (localObject2 != null)
      {
        localObject2 = ((ConstraintSet.Constraint)localObject1).OooO0O0;
        if (localObject2 != null)
        {
          localObject2 = this.OooO0oO.keySet().iterator();
          for (;;)
          {
            boolean bool2 = ((Iterator)localObject2).hasNext();
            if (!bool2) {
              break;
            }
            int i = ((Integer)((Iterator)localObject2).next()).intValue();
            Object localObject3 = getConstraint(i);
            Object localObject4 = ((ConstraintSet.Constraint)localObject3).OooO0o0.o00O0O;
            if (localObject4 != null)
            {
              String str = ((ConstraintSet.Constraint)localObject1).OooO0O0;
              boolean bool3 = str.matches((String)localObject4);
              if (bool3)
              {
                ((ConstraintSet.Constraint)localObject1).OooO0oo.OooO0o0((ConstraintSet.Constraint)localObject3);
                localObject3 = ((ConstraintSet.Constraint)localObject3).OooO0oO;
                localObject4 = (HashMap)((ConstraintSet.Constraint)localObject1).OooO0oO.clone();
                ((HashMap)localObject3).putAll((Map)localObject4);
              }
            }
          }
        }
        int j = ((ConstraintSet.Constraint)localObject1).OooO00o;
        localObject2 = getConstraint(j);
        localObject1 = ((ConstraintSet.Constraint)localObject1).OooO0oo;
        ((ConstraintSet.Constraint.Delta)localObject1).OooO0o0((ConstraintSet.Constraint)localObject2);
      }
    }
  }
  
  public void OooOO0(ConstraintHelper paramConstraintHelper, ConstraintWidget paramConstraintWidget, ConstraintLayout.LayoutParams paramLayoutParams, SparseArray paramSparseArray)
  {
    int i = paramConstraintHelper.getId();
    HashMap localHashMap = this.OooO0oO;
    Integer localInteger = Integer.valueOf(i);
    boolean bool = localHashMap.containsKey(localInteger);
    if (bool)
    {
      localHashMap = this.OooO0oO;
      Object localObject = Integer.valueOf(i);
      localObject = (ConstraintSet.Constraint)localHashMap.get(localObject);
      if (localObject != null)
      {
        bool = paramConstraintWidget instanceof HelperWidget;
        if (bool)
        {
          paramConstraintWidget = (HelperWidget)paramConstraintWidget;
          paramConstraintHelper.OooOOOo((ConstraintSet.Constraint)localObject, paramConstraintWidget, paramLayoutParams, paramSparseArray);
        }
      }
    }
  }
  
  public void OooOO0O(ConstraintLayout paramConstraintLayout, boolean paramBoolean)
  {
    int i = paramConstraintLayout.getChildCount();
    Object localObject1 = new java/util/HashSet;
    Set localSet = this.OooO0oO.keySet();
    ((HashSet)localObject1).<init>(localSet);
    int j = 0;
    localSet = null;
    int k = 0;
    ConstraintSet.Constraint localConstraint = null;
    Object localObject2;
    Object localObject3;
    Object localObject5;
    int n;
    for (;;)
    {
      int m = 1;
      float f1 = 1.4E-45F;
      if (k >= i) {
        break;
      }
      localObject2 = paramConstraintLayout.getChildAt(k);
      int i1 = ((View)localObject2).getId();
      localObject3 = this.OooO0oO;
      Integer localInteger = Integer.valueOf(i1);
      boolean bool2 = ((HashMap)localObject3).containsKey(localInteger);
      Object localObject4;
      if (!bool2)
      {
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject5 = "id unknown ";
        ((StringBuilder)localObject4).append((String)localObject5);
        localObject2 = Debug.OooO0O0((View)localObject2);
        ((StringBuilder)localObject4).append((String)localObject2);
      }
      else
      {
        bool2 = this.OooO0o;
        int i5 = -1;
        float f2 = 0.0F / 0.0F;
        if ((bool2) && (i1 == i5))
        {
          paramConstraintLayout = new java/lang/RuntimeException;
          paramConstraintLayout.<init>("All children of ConstraintLayout must have ids to use ConstraintSet");
          throw paramConstraintLayout;
        }
        if (i1 != i5)
        {
          localObject3 = this.OooO0oO;
          Object localObject6 = Integer.valueOf(i1);
          bool2 = ((HashMap)localObject3).containsKey(localObject6);
          int i3;
          if (bool2)
          {
            localObject3 = Integer.valueOf(i1);
            ((HashSet)localObject1).remove(localObject3);
            localObject3 = this.OooO0oO;
            localObject6 = Integer.valueOf(i1);
            localObject3 = (ConstraintSet.Constraint)((HashMap)localObject3).get(localObject6);
            if (localObject3 != null)
            {
              boolean bool3 = localObject2 instanceof Barrier;
              if (bool3)
              {
                ((ConstraintSet.Constraint)localObject3).OooO0o0.Ooooooo = m;
                localObject4 = localObject2;
                localObject4 = (Barrier)localObject2;
                ((View)localObject4).setId(i1);
                i1 = ((ConstraintSet.Constraint)localObject3).OooO0o0.Oooooo;
                ((Barrier)localObject4).setType(i1);
                i1 = ((ConstraintSet.Constraint)localObject3).OooO0o0.OoooooO;
                ((Barrier)localObject4).setMargin(i1);
                boolean bool1 = ((ConstraintSet.Constraint)localObject3).OooO0o0.o00o0O;
                ((Barrier)localObject4).setAllowsGoneWidget(bool1);
                localObject5 = ((ConstraintSet.Constraint)localObject3).OooO0o0;
                localObject6 = ((ConstraintSet.Layout)localObject5).o0OoOo0;
                if (localObject6 != null)
                {
                  ((ConstraintHelper)localObject4).setReferencedIds((int[])localObject6);
                }
                else
                {
                  localObject6 = ((ConstraintSet.Layout)localObject5).ooOO;
                  if (localObject6 != null)
                  {
                    localObject6 = OooOOoo((View)localObject4, (String)localObject6);
                    ((ConstraintSet.Layout)localObject5).o0OoOo0 = ((int[])localObject6);
                    localObject5 = ((ConstraintSet.Constraint)localObject3).OooO0o0.o0OoOo0;
                    ((ConstraintHelper)localObject4).setReferencedIds((int[])localObject5);
                  }
                }
              }
              localObject4 = (ConstraintLayout.LayoutParams)((View)localObject2).getLayoutParams();
              ((ConstraintLayout.LayoutParams)localObject4).OooO00o();
              ((ConstraintSet.Constraint)localObject3).OooO0o0((ConstraintLayout.LayoutParams)localObject4);
              if (paramBoolean)
              {
                localObject5 = ((ConstraintSet.Constraint)localObject3).OooO0oO;
                ConstraintAttribute.OooO0oO((View)localObject2, (HashMap)localObject5);
              }
              ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject4);
              localObject4 = ((ConstraintSet.Constraint)localObject3).OooO0OO;
              int i2 = ((ConstraintSet.PropertySet)localObject4).OooO0OO;
              if (i2 == 0)
              {
                m = ((ConstraintSet.PropertySet)localObject4).OooO0O0;
                ((View)localObject2).setVisibility(m);
              }
              f1 = ((ConstraintSet.Constraint)localObject3).OooO0OO.OooO0Oo;
              ((View)localObject2).setAlpha(f1);
              f1 = ((ConstraintSet.Constraint)localObject3).OooO0o.OooO0O0;
              ((View)localObject2).setRotation(f1);
              f1 = ((ConstraintSet.Constraint)localObject3).OooO0o.OooO0OO;
              ((View)localObject2).setRotationX(f1);
              f1 = ((ConstraintSet.Constraint)localObject3).OooO0o.OooO0Oo;
              ((View)localObject2).setRotationY(f1);
              f1 = ((ConstraintSet.Constraint)localObject3).OooO0o.OooO0o0;
              ((View)localObject2).setScaleX(f1);
              f1 = ((ConstraintSet.Constraint)localObject3).OooO0o.OooO0o;
              ((View)localObject2).setScaleY(f1);
              localObject4 = ((ConstraintSet.Constraint)localObject3).OooO0o;
              i2 = ((ConstraintSet.Transform)localObject4).OooO;
              if (i2 != i5)
              {
                localObject4 = (View)((View)localObject2).getParent();
                localObject5 = ((ConstraintSet.Constraint)localObject3).OooO0o;
                i2 = ((ConstraintSet.Transform)localObject5).OooO;
                localObject4 = ((View)localObject4).findViewById(i2);
                if (localObject4 != null)
                {
                  i2 = ((View)localObject4).getTop();
                  i5 = ((View)localObject4).getBottom();
                  i2 += i5;
                  float f3 = i2;
                  f2 = 2.0F;
                  f3 /= f2;
                  int i6 = ((View)localObject4).getLeft();
                  m = ((View)localObject4).getRight();
                  f1 = (i6 + m) / f2;
                  i5 = ((View)localObject2).getRight();
                  i6 = ((View)localObject2).getLeft();
                  i5 -= i6;
                  if (i5 > 0)
                  {
                    i5 = ((View)localObject2).getBottom();
                    i6 = ((View)localObject2).getTop();
                    i5 -= i6;
                    if (i5 > 0)
                    {
                      f2 = ((View)localObject2).getLeft();
                      f1 -= f2;
                      i5 = ((View)localObject2).getTop();
                      f2 = i5;
                      f3 -= f2;
                      ((View)localObject2).setPivotX(f1);
                      ((View)localObject2).setPivotY(f3);
                    }
                  }
                }
              }
              else
              {
                f1 = ((ConstraintSet.Transform)localObject4).OooO0oO;
                n = Float.isNaN(f1);
                if (n == 0)
                {
                  localObject4 = ((ConstraintSet.Constraint)localObject3).OooO0o;
                  f1 = ((ConstraintSet.Transform)localObject4).OooO0oO;
                  ((View)localObject2).setPivotX(f1);
                }
                localObject4 = ((ConstraintSet.Constraint)localObject3).OooO0o;
                f1 = ((ConstraintSet.Transform)localObject4).OooO0oo;
                n = Float.isNaN(f1);
                if (n == 0)
                {
                  localObject4 = ((ConstraintSet.Constraint)localObject3).OooO0o;
                  f1 = ((ConstraintSet.Transform)localObject4).OooO0oo;
                  ((View)localObject2).setPivotY(f1);
                }
              }
              f1 = ((ConstraintSet.Constraint)localObject3).OooO0o.OooOO0;
              ((View)localObject2).setTranslationX(f1);
              f1 = ((ConstraintSet.Constraint)localObject3).OooO0o.OooOO0O;
              ((View)localObject2).setTranslationY(f1);
              f1 = ((ConstraintSet.Constraint)localObject3).OooO0o.OooOO0o;
              ((View)localObject2).setTranslationZ(f1);
              localObject4 = ((ConstraintSet.Constraint)localObject3).OooO0o;
              i3 = ((ConstraintSet.Transform)localObject4).OooOOO0;
              if (i3 != 0)
              {
                f1 = ((ConstraintSet.Transform)localObject4).OooOOO;
                ((View)localObject2).setElevation(f1);
              }
            }
          }
          else
          {
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject2 = "WARNING NO CONSTRAINTS for view ";
            ((StringBuilder)localObject4).append((String)localObject2);
            ((StringBuilder)localObject4).append(i3);
          }
        }
      }
      k += 1;
    }
    Object localObject7 = ((HashSet)localObject1).iterator();
    for (;;)
    {
      boolean bool4 = ((Iterator)localObject7).hasNext();
      if (!bool4) {
        break;
      }
      localObject1 = (Integer)((Iterator)localObject7).next();
      localConstraint = (ConstraintSet.Constraint)this.OooO0oO.get(localObject1);
      if (localConstraint != null)
      {
        localObject2 = localConstraint.OooO0o0;
        int i8 = ((ConstraintSet.Layout)localObject2).Ooooooo;
        if (i8 == n)
        {
          localObject2 = new androidx/constraintlayout/widget/Barrier;
          localObject5 = paramConstraintLayout.getContext();
          ((Barrier)localObject2).<init>((Context)localObject5);
          int i4 = ((Integer)localObject1).intValue();
          ((View)localObject2).setId(i4);
          localObject5 = localConstraint.OooO0o0;
          localObject3 = ((ConstraintSet.Layout)localObject5).o0OoOo0;
          if (localObject3 != null)
          {
            ((ConstraintHelper)localObject2).setReferencedIds((int[])localObject3);
          }
          else
          {
            localObject3 = ((ConstraintSet.Layout)localObject5).ooOO;
            if (localObject3 != null)
            {
              localObject3 = OooOOoo((View)localObject2, (String)localObject3);
              ((ConstraintSet.Layout)localObject5).o0OoOo0 = ((int[])localObject3);
              localObject5 = localConstraint.OooO0o0.o0OoOo0;
              ((ConstraintHelper)localObject2).setReferencedIds((int[])localObject5);
            }
          }
          i4 = localConstraint.OooO0o0.Oooooo;
          ((Barrier)localObject2).setType(i4);
          i4 = localConstraint.OooO0o0.OoooooO;
          ((Barrier)localObject2).setMargin(i4);
          localObject5 = paramConstraintLayout.generateDefaultLayoutParams();
          ((ConstraintHelper)localObject2).OooOo0o();
          localConstraint.OooO0o0((ConstraintLayout.LayoutParams)localObject5);
          paramConstraintLayout.addView((View)localObject2, (ViewGroup.LayoutParams)localObject5);
        }
        localObject2 = localConstraint.OooO0o0;
        boolean bool6 = ((ConstraintSet.Layout)localObject2).OooO00o;
        if (bool6)
        {
          localObject2 = new androidx/constraintlayout/widget/Guideline;
          localObject5 = paramConstraintLayout.getContext();
          ((Guideline)localObject2).<init>((Context)localObject5);
          int i7 = ((Integer)localObject1).intValue();
          ((View)localObject2).setId(i7);
          localObject1 = paramConstraintLayout.generateDefaultLayoutParams();
          localConstraint.OooO0o0((ConstraintLayout.LayoutParams)localObject1);
          paramConstraintLayout.addView((View)localObject2, (ViewGroup.LayoutParams)localObject1);
        }
      }
    }
    while (j < i)
    {
      localObject7 = paramConstraintLayout.getChildAt(j);
      boolean bool5 = localObject7 instanceof ConstraintHelper;
      if (bool5)
      {
        localObject7 = (ConstraintHelper)localObject7;
        ((ConstraintHelper)localObject7).OooOO0(paramConstraintLayout);
      }
      j += 1;
    }
  }
  
  public void OooOO0o(int paramInt, ConstraintLayout.LayoutParams paramLayoutParams)
  {
    HashMap localHashMap = this.OooO0oO;
    Integer localInteger = Integer.valueOf(paramInt);
    boolean bool = localHashMap.containsKey(localInteger);
    if (bool)
    {
      localHashMap = this.OooO0oO;
      Object localObject = Integer.valueOf(paramInt);
      localObject = (ConstraintSet.Constraint)localHashMap.get(localObject);
      if (localObject != null) {
        ((ConstraintSet.Constraint)localObject).OooO0o0(paramLayoutParams);
      }
    }
  }
  
  public void OooOOO(Context paramContext, int paramInt)
  {
    paramContext = (ConstraintLayout)LayoutInflater.from(paramContext).inflate(paramInt, null);
    OooOOOO(paramContext);
  }
  
  public void OooOOOO(ConstraintLayout paramConstraintLayout)
  {
    int i = paramConstraintLayout.getChildCount();
    this.OooO0oO.clear();
    int j = 0;
    while (j < i)
    {
      Object localObject1 = paramConstraintLayout.getChildAt(j);
      Object localObject2 = (ConstraintLayout.LayoutParams)((View)localObject1).getLayoutParams();
      int k = ((View)localObject1).getId();
      boolean bool2 = this.OooO0o;
      if (bool2)
      {
        int n = -1;
        if (k == n)
        {
          paramConstraintLayout = new java/lang/RuntimeException;
          paramConstraintLayout.<init>("All children of ConstraintLayout must have ids to use ConstraintSet");
          throw paramConstraintLayout;
        }
      }
      Object localObject3 = this.OooO0oO;
      Object localObject4 = Integer.valueOf(k);
      boolean bool3 = ((HashMap)localObject3).containsKey(localObject4);
      if (!bool3)
      {
        localObject3 = this.OooO0oO;
        localObject4 = Integer.valueOf(k);
        ConstraintSet.Constraint localConstraint = new androidx/constraintlayout/widget/ConstraintSet$Constraint;
        localConstraint.<init>();
        ((HashMap)localObject3).put(localObject4, localConstraint);
      }
      localObject3 = this.OooO0oO;
      localObject4 = Integer.valueOf(k);
      localObject3 = (ConstraintSet.Constraint)((HashMap)localObject3).get(localObject4);
      if (localObject3 != null)
      {
        localObject4 = ConstraintAttribute.OooO0OO(this.OooO0o0, (View)localObject1);
        ((ConstraintSet.Constraint)localObject3).OooO0oO = ((HashMap)localObject4);
        ConstraintSet.Constraint.OooO00o((ConstraintSet.Constraint)localObject3, k, (ConstraintLayout.LayoutParams)localObject2);
        localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0OO;
        k = ((View)localObject1).getVisibility();
        ((ConstraintSet.PropertySet)localObject2).OooO0O0 = k;
        localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0OO;
        float f1 = ((View)localObject1).getAlpha();
        ((ConstraintSet.PropertySet)localObject2).OooO0Oo = f1;
        localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0o;
        f1 = ((View)localObject1).getRotation();
        ((ConstraintSet.Transform)localObject2).OooO0O0 = f1;
        localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0o;
        f1 = ((View)localObject1).getRotationX();
        ((ConstraintSet.Transform)localObject2).OooO0OO = f1;
        localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0o;
        f1 = ((View)localObject1).getRotationY();
        ((ConstraintSet.Transform)localObject2).OooO0Oo = f1;
        localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0o;
        f1 = ((View)localObject1).getScaleX();
        ((ConstraintSet.Transform)localObject2).OooO0o0 = f1;
        localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0o;
        f1 = ((View)localObject1).getScaleY();
        ((ConstraintSet.Transform)localObject2).OooO0o = f1;
        float f2 = ((View)localObject1).getPivotX();
        f1 = ((View)localObject1).getPivotY();
        double d1 = f2;
        double d2 = 0.0D;
        boolean bool4 = d1 < d2;
        if (!bool4)
        {
          d1 = f1;
          bool4 = d1 < d2;
          if (!bool4) {}
        }
        else
        {
          localObject4 = ((ConstraintSet.Constraint)localObject3).OooO0o;
          ((ConstraintSet.Transform)localObject4).OooO0oO = f2;
          ((ConstraintSet.Transform)localObject4).OooO0oo = f1;
        }
        localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0o;
        f1 = ((View)localObject1).getTranslationX();
        ((ConstraintSet.Transform)localObject2).OooOO0 = f1;
        localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0o;
        f1 = ((View)localObject1).getTranslationY();
        ((ConstraintSet.Transform)localObject2).OooOO0O = f1;
        localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0o;
        f1 = ((View)localObject1).getTranslationZ();
        ((ConstraintSet.Transform)localObject2).OooOO0o = f1;
        localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0o;
        boolean bool1 = ((ConstraintSet.Transform)localObject2).OooOOO0;
        if (bool1)
        {
          f1 = ((View)localObject1).getElevation();
          ((ConstraintSet.Transform)localObject2).OooOOO = f1;
        }
        boolean bool5 = localObject1 instanceof Barrier;
        if (bool5)
        {
          localObject1 = (Barrier)localObject1;
          localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0o0;
          bool1 = ((Barrier)localObject1).getAllowsGoneWidget();
          ((ConstraintSet.Layout)localObject2).o00o0O = bool1;
          localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0o0;
          int[] arrayOfInt = ((ConstraintHelper)localObject1).getReferencedIds();
          ((ConstraintSet.Layout)localObject2).o0OoOo0 = arrayOfInt;
          localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0o0;
          int m = ((Barrier)localObject1).getType();
          ((ConstraintSet.Layout)localObject2).Oooooo = m;
          localObject2 = ((ConstraintSet.Constraint)localObject3).OooO0o0;
          int i1 = ((Barrier)localObject1).getMargin();
          ((ConstraintSet.Layout)localObject2).OoooooO = i1;
        }
      }
      j += 1;
    }
  }
  
  public void OooOOOo(ConstraintSet paramConstraintSet)
  {
    this.OooO0oO.clear();
    Iterator localIterator = paramConstraintSet.OooO0oO.keySet().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Integer localInteger = (Integer)localIterator.next();
      ConstraintSet.Constraint localConstraint = (ConstraintSet.Constraint)paramConstraintSet.OooO0oO.get(localInteger);
      if (localConstraint != null)
      {
        HashMap localHashMap = this.OooO0oO;
        localConstraint = localConstraint.OooO0o();
        localHashMap.put(localInteger, localConstraint);
      }
    }
  }
  
  public void OooOOo(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    ConstraintSet.Layout localLayout = get(paramInt1).OooO0o0;
    localLayout.OooOoo0 = paramInt2;
    localLayout.OooOoo = paramInt3;
    localLayout.OooOooO = paramFloat;
  }
  
  public void OooOOo0(Constraints paramConstraints)
  {
    int i = paramConstraints.getChildCount();
    this.OooO0oO.clear();
    int j = 0;
    while (j < i)
    {
      Object localObject1 = paramConstraints.getChildAt(j);
      Constraints.LayoutParams localLayoutParams = (Constraints.LayoutParams)((View)localObject1).getLayoutParams();
      int k = ((View)localObject1).getId();
      boolean bool1 = this.OooO0o;
      if (bool1)
      {
        int m = -1;
        if (k == m)
        {
          paramConstraints = new java/lang/RuntimeException;
          paramConstraints.<init>("All children of ConstraintLayout must have ids to use ConstraintSet");
          throw paramConstraints;
        }
      }
      Object localObject2 = this.OooO0oO;
      Integer localInteger = Integer.valueOf(k);
      boolean bool2 = ((HashMap)localObject2).containsKey(localInteger);
      if (!bool2)
      {
        localObject2 = this.OooO0oO;
        localInteger = Integer.valueOf(k);
        ConstraintSet.Constraint localConstraint = new androidx/constraintlayout/widget/ConstraintSet$Constraint;
        localConstraint.<init>();
        ((HashMap)localObject2).put(localInteger, localConstraint);
      }
      localObject2 = this.OooO0oO;
      localInteger = Integer.valueOf(k);
      localObject2 = (ConstraintSet.Constraint)((HashMap)localObject2).get(localInteger);
      if (localObject2 != null)
      {
        boolean bool3 = localObject1 instanceof ConstraintHelper;
        if (bool3)
        {
          localObject1 = (ConstraintHelper)localObject1;
          ConstraintSet.Constraint.OooO0O0((ConstraintSet.Constraint)localObject2, (ConstraintHelper)localObject1, k, localLayoutParams);
        }
        ConstraintSet.Constraint.OooO0OO((ConstraintSet.Constraint)localObject2, k, localLayoutParams);
      }
      j += 1;
    }
  }
  
  public final int[] OooOOoo(View paramView, String paramString)
  {
    paramString = paramString.split(",");
    Context localContext = paramView.getContext();
    int i = paramString.length;
    int[] arrayOfInt = new int[i];
    int j = 0;
    int m;
    for (int k = 0;; k = m)
    {
      m = paramString.length;
      if (j >= m) {
        break;
      }
      Object localObject1 = paramString[j].trim();
      Object localObject2 = R.id.class;
      boolean bool;
      Object localObject3;
      int n;
      try
      {
        localObject2 = ((Class)localObject2).getField((String)localObject1);
        bool = false;
        localObject3 = null;
        n = ((Field)localObject2).getInt(null);
      }
      catch (Exception localException)
      {
        n = 0;
        localObject2 = null;
      }
      if (n == 0)
      {
        localObject2 = localContext.getResources();
        localObject3 = "id";
        String str = localContext.getPackageName();
        n = ((Resources)localObject2).getIdentifier((String)localObject1, (String)localObject3, str);
      }
      if (n == 0)
      {
        bool = paramView.isInEditMode();
        if (bool)
        {
          localObject3 = paramView.getParent();
          bool = localObject3 instanceof ConstraintLayout;
          if (bool)
          {
            localObject3 = (ConstraintLayout)paramView.getParent();
            localObject1 = ((ConstraintLayout)localObject3).getDesignInformation(0, localObject1);
            if (localObject1 != null)
            {
              bool = localObject1 instanceof Integer;
              if (bool)
              {
                localObject1 = (Integer)localObject1;
                n = ((Integer)localObject1).intValue();
              }
            }
          }
        }
      }
      m = k + 1;
      arrayOfInt[k] = n;
      j += 1;
    }
    int i1 = paramString.length;
    if (k != i1) {
      arrayOfInt = Arrays.copyOf(arrayOfInt, k);
    }
    return arrayOfInt;
  }
  
  public void OooOo0(Context paramContext, int paramInt)
  {
    Object localObject1 = paramContext.getResources();
    XmlResourceParser localXmlResourceParser = ((Resources)localObject1).getXml(paramInt);
    try
    {
      int j;
      for (int i = localXmlResourceParser.getEventType();; j = localXmlResourceParser.next())
      {
        int k = 1;
        if (i == k) {
          break;
        }
        if (i != 0)
        {
          int m = 2;
          if (i == m)
          {
            localObject1 = localXmlResourceParser.getName();
            Object localObject2 = Xml.asAttributeSet(localXmlResourceParser);
            String str = null;
            localObject2 = OooOo00(paramContext, (AttributeSet)localObject2, false);
            str = "Guideline";
            boolean bool = ((String)localObject1).equalsIgnoreCase(str);
            if (bool)
            {
              localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0o0;
              ((ConstraintSet.Layout)localObject1).OooO00o = k;
            }
            localObject1 = this.OooO0oO;
            k = ((ConstraintSet.Constraint)localObject2).OooO00o;
            Integer localInteger = Integer.valueOf(k);
            ((HashMap)localObject1).put(localInteger, localObject2);
          }
        }
        else
        {
          localXmlResourceParser.getName();
        }
      }
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    catch (XmlPullParserException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public final ConstraintSet.Constraint OooOo00(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    ConstraintSet.Constraint localConstraint = new androidx/constraintlayout/widget/ConstraintSet$Constraint;
    localConstraint.<init>();
    int[] arrayOfInt;
    if (paramBoolean) {
      arrayOfInt = R.styleable.ConstraintOverride;
    } else {
      arrayOfInt = R.styleable.Constraint;
    }
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    OooOoOO(paramContext, localConstraint, paramAttributeSet, paramBoolean);
    paramAttributeSet.recycle();
    return localConstraint;
  }
  
  public void OooOo0O(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    try
    {
      int i = paramXmlPullParser.getEventType();
      StringBuilder localStringBuilder = null;
      Object localObject1 = null;
      for (;;)
      {
        int k = 1;
        if (i == k) {
          break;
        }
        if (i != 0)
        {
          int m = -1;
          int i1 = 3;
          int i2 = 2;
          String str1 = null;
          Object localObject2;
          int i3;
          boolean bool;
          Object localObject4;
          if (i != i2)
          {
            if (i == i1)
            {
              localObject2 = paramXmlPullParser.getName();
              Object localObject3 = Locale.ROOT;
              localObject2 = ((String)localObject2).toLowerCase((Locale)localObject3);
              i3 = ((String)localObject2).hashCode();
              switch (i3)
              {
              default: 
                break;
              case 2146106725: 
                localObject3 = "constraintset";
                bool = ((String)localObject2).equals(localObject3);
                if (bool) {
                  m = 0;
                }
                break;
              case 426575017: 
                str1 = "constraintoverride";
                bool = ((String)localObject2).equals(str1);
                if (bool) {
                  m = i2;
                }
                break;
              case -190376483: 
                str1 = "constraint";
                bool = ((String)localObject2).equals(str1);
                if (bool) {
                  m = k;
                }
                break;
              case -2075718416: 
                str1 = "guideline";
                bool = ((String)localObject2).equals(str1);
                if (bool) {
                  m = i1;
                }
                break;
              }
              if (m != 0)
              {
                if ((m != k) && (m != i2) && (m != i1)) {
                  break label1215;
                }
                localObject2 = this.OooO0oO;
                k = ((ConstraintSet.Constraint)localObject1).OooO00o;
                localObject4 = Integer.valueOf(k);
                ((HashMap)localObject2).put(localObject4, localObject1);
                localObject1 = null;
              }
            }
          }
          else
          {
            localObject2 = paramXmlPullParser.getName();
            i3 = ((String)localObject2).hashCode();
            String str2;
            int n;
            switch (i3)
            {
            default: 
              break;
            case 1803088381: 
              str2 = "Constraint";
              bool = ((String)localObject2).equals(str2);
              if (bool) {
                n = 0;
              }
              break;
            case 1791837707: 
              str2 = "CustomAttribute";
              bool = ((String)localObject2).equals(str2);
              if (bool) {
                n = 8;
              }
              break;
            case 1331510167: 
              String str3 = "Barrier";
              bool = ((String)localObject2).equals(str3);
              if (bool) {
                n = i1;
              }
              break;
            case 366511058: 
              str2 = "CustomMethod";
              bool = ((String)localObject2).equals(str2);
              if (bool) {
                n = 9;
              }
              break;
            case -71750448: 
              str2 = "Guideline";
              bool = ((String)localObject2).equals(str2);
              if (bool) {
                n = i2;
              }
              break;
            case -1238332596: 
              str2 = "Transform";
              bool = ((String)localObject2).equals(str2);
              if (bool) {
                n = 5;
              }
              break;
            case -1269513683: 
              str2 = "PropertySet";
              bool = ((String)localObject2).equals(str2);
              if (bool) {
                n = 4;
              }
              break;
            case -1962203927: 
              str2 = "ConstraintOverride";
              bool = ((String)localObject2).equals(str2);
              if (bool) {
                n = k;
              }
              break;
            case -1984451626: 
              str2 = "Motion";
              bool = ((String)localObject2).equals(str2);
              if (bool) {
                n = 7;
              }
              break;
            case -2025855158: 
              str2 = "Layout";
              bool = ((String)localObject2).equals(str2);
              if (bool) {
                n = 6;
              }
              break;
            }
            localObject2 = "XML parser error must be within a Constraint ";
            int i4;
            switch (n)
            {
            default: 
              break;
            case 8: 
            case 9: 
              if (localObject1 != null)
              {
                localObject2 = ((ConstraintSet.Constraint)localObject1).OooO0oO;
                ConstraintAttribute.OooO0o(paramContext, paramXmlPullParser, (HashMap)localObject2);
                break label1215;
              }
              paramContext = new java/lang/RuntimeException;
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localStringBuilder.append((String)localObject2);
              i4 = paramXmlPullParser.getLineNumber();
              localStringBuilder.append(i4);
              paramXmlPullParser = localStringBuilder.toString();
              paramContext.<init>(paramXmlPullParser);
              throw paramContext;
            case 7: 
              if (localObject1 != null)
              {
                localObject2 = ((ConstraintSet.Constraint)localObject1).OooO0Oo;
                localObject4 = Xml.asAttributeSet(paramXmlPullParser);
                ((ConstraintSet.Motion)localObject2).OooO0O0(paramContext, (AttributeSet)localObject4);
                break label1215;
              }
              paramContext = new java/lang/RuntimeException;
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localStringBuilder.append((String)localObject2);
              i4 = paramXmlPullParser.getLineNumber();
              localStringBuilder.append(i4);
              paramXmlPullParser = localStringBuilder.toString();
              paramContext.<init>(paramXmlPullParser);
              throw paramContext;
            case 6: 
              if (localObject1 != null)
              {
                localObject2 = ((ConstraintSet.Constraint)localObject1).OooO0o0;
                localObject4 = Xml.asAttributeSet(paramXmlPullParser);
                ((ConstraintSet.Layout)localObject2).OooO0O0(paramContext, (AttributeSet)localObject4);
                break label1215;
              }
              paramContext = new java/lang/RuntimeException;
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localStringBuilder.append((String)localObject2);
              i4 = paramXmlPullParser.getLineNumber();
              localStringBuilder.append(i4);
              paramXmlPullParser = localStringBuilder.toString();
              paramContext.<init>(paramXmlPullParser);
              throw paramContext;
            case 5: 
              if (localObject1 != null)
              {
                localObject2 = ((ConstraintSet.Constraint)localObject1).OooO0o;
                localObject4 = Xml.asAttributeSet(paramXmlPullParser);
                ((ConstraintSet.Transform)localObject2).OooO0O0(paramContext, (AttributeSet)localObject4);
                break label1215;
              }
              paramContext = new java/lang/RuntimeException;
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localStringBuilder.append((String)localObject2);
              i4 = paramXmlPullParser.getLineNumber();
              localStringBuilder.append(i4);
              paramXmlPullParser = localStringBuilder.toString();
              paramContext.<init>(paramXmlPullParser);
              throw paramContext;
            case 4: 
              if (localObject1 != null)
              {
                localObject2 = ((ConstraintSet.Constraint)localObject1).OooO0OO;
                localObject4 = Xml.asAttributeSet(paramXmlPullParser);
                ((ConstraintSet.PropertySet)localObject2).OooO0O0(paramContext, (AttributeSet)localObject4);
                break label1215;
              }
              paramContext = new java/lang/RuntimeException;
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localStringBuilder.append((String)localObject2);
              i4 = paramXmlPullParser.getLineNumber();
              localStringBuilder.append(i4);
              paramXmlPullParser = localStringBuilder.toString();
              paramContext.<init>(paramXmlPullParser);
              throw paramContext;
            case 3: 
              localObject2 = Xml.asAttributeSet(paramXmlPullParser);
              localObject2 = OooOo00(paramContext, (AttributeSet)localObject2, false);
              localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0o0;
              ((ConstraintSet.Layout)localObject1).Ooooooo = k;
              break;
            case 2: 
              localObject2 = Xml.asAttributeSet(paramXmlPullParser);
              localObject2 = OooOo00(paramContext, (AttributeSet)localObject2, false);
              localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0o0;
              ((ConstraintSet.Layout)localObject1).OooO00o = k;
              ((ConstraintSet.Layout)localObject1).OooO0O0 = k;
              break;
            case 1: 
              localObject2 = Xml.asAttributeSet(paramXmlPullParser);
              localObject2 = OooOo00(paramContext, (AttributeSet)localObject2, k);
              break;
            case 0: 
              localObject2 = Xml.asAttributeSet(paramXmlPullParser);
              localObject2 = OooOo00(paramContext, (AttributeSet)localObject2, false);
            }
            localObject1 = localObject2;
          }
        }
        else
        {
          paramXmlPullParser.getName();
        }
        label1215:
        int j = paramXmlPullParser.next();
      }
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    catch (XmlPullParserException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public final void OooOoOO(Context paramContext, ConstraintSet.Constraint paramConstraint, TypedArray paramTypedArray, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      OooOoo0(paramContext, paramConstraint, paramTypedArray);
      return;
    }
    int i = paramTypedArray.getIndexCount();
    paramBoolean = false;
    int j = 0;
    while (j < i)
    {
      int k = paramTypedArray.getIndex(j);
      int i4 = R.styleable.Constraint_android_id;
      int i5 = 1;
      float f1 = 1.4E-45F;
      if (k != i4)
      {
        i4 = R.styleable.Constraint_android_layout_marginStart;
        if (i4 != k)
        {
          i4 = R.styleable.Constraint_android_layout_marginEnd;
          if (i4 != k)
          {
            paramConstraint.OooO0Oo.OooO00o = i5;
            paramConstraint.OooO0o0.OooO0O0 = i5;
            paramConstraint.OooO0OO.OooO00o = i5;
            localObject1 = paramConstraint.OooO0o;
            ((ConstraintSet.Transform)localObject1).OooO00o = i5;
          }
        }
      }
      Object localObject1 = OooO;
      i4 = ((SparseIntArray)localObject1).get(k);
      String str = "   ";
      int i8 = 1065353216;
      float f2 = 1.0F;
      int i9 = 3;
      Object localObject2;
      Object localObject3;
      label1042:
      float f3;
      boolean bool1;
      int m;
      int n;
      int i6;
      int i1;
      int i2;
      int i7;
      int i3;
      switch (i4)
      {
      case 88: 
      case 89: 
      case 90: 
      default: 
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = "Unknown attribute 0x";
        break;
      case 97: 
        localObject1 = paramConstraint.OooO0o0;
        i5 = ((ConstraintSet.Layout)localObject1).o00ooo;
        k = paramTypedArray.getInt(k, i5);
        ((ConstraintSet.Layout)localObject1).o00ooo = k;
        break;
      case 96: 
        localObject1 = paramConstraint.OooO0o0;
        OooOo(localObject1, paramTypedArray, k, i5);
        break;
      case 95: 
        localObject1 = paramConstraint.OooO0o0;
        OooOo(localObject1, paramTypedArray, k, 0);
        break;
      case 94: 
        localObject1 = paramConstraint.OooO0o0;
        i5 = ((ConstraintSet.Layout)localObject1).OoooOO0;
        k = paramTypedArray.getDimensionPixelSize(k, i5);
        ((ConstraintSet.Layout)localObject1).OoooOO0 = k;
        break;
      case 93: 
        localObject1 = paramConstraint.OooO0o0;
        i5 = ((ConstraintSet.Layout)localObject1).Oooo0oO;
        k = paramTypedArray.getDimensionPixelSize(k, i5);
        ((ConstraintSet.Layout)localObject1).Oooo0oO = k;
        break;
      case 92: 
        localObject1 = paramConstraint.OooO0o0;
        i5 = ((ConstraintSet.Layout)localObject1).OooOo00;
        k = OooOo0o(paramTypedArray, k, i5);
        ((ConstraintSet.Layout)localObject1).OooOo00 = k;
        break;
      case 91: 
        localObject1 = paramConstraint.OooO0o0;
        i5 = ((ConstraintSet.Layout)localObject1).OooOOoo;
        k = OooOo0o(paramTypedArray, k, i5);
        ((ConstraintSet.Layout)localObject1).OooOOoo = k;
        break;
      case 87: 
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = "unused attribute 0x";
        ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = Integer.toHexString(k);
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(str);
        localObject2 = OooO;
        k = ((SparseIntArray)localObject2).get(k);
        ((StringBuilder)localObject1).append(k);
        break;
      case 86: 
        localObject1 = paramTypedArray.peekValue(k);
        i4 = ((TypedValue)localObject1).type;
        int i10 = -2;
        i8 = -1;
        f2 = 0.0F / 0.0F;
        if (i4 == i5)
        {
          localObject1 = paramConstraint.OooO0Oo;
          k = paramTypedArray.getResourceId(k, i8);
          ((ConstraintSet.Motion)localObject1).OooOOO = k;
          localObject3 = paramConstraint.OooO0Oo;
          i4 = ((ConstraintSet.Motion)localObject3).OooOOO;
          if (i4 == i8) {}
        }
        else
        {
          for (;;)
          {
            ((ConstraintSet.Motion)localObject3).OooOOO0 = i10;
            break label3869;
            if (i4 != i9) {
              break label1042;
            }
            localObject1 = paramConstraint.OooO0Oo;
            localObject2 = paramTypedArray.getString(k);
            ((ConstraintSet.Motion)localObject1).OooOO0o = ((String)localObject2);
            localObject1 = paramConstraint.OooO0Oo.OooOO0o;
            localObject2 = "/";
            i4 = ((String)localObject1).indexOf((String)localObject2);
            if (i4 <= 0) {
              break;
            }
            localObject1 = paramConstraint.OooO0Oo;
            k = paramTypedArray.getResourceId(k, i8);
            ((ConstraintSet.Motion)localObject1).OooOOO = k;
            localObject3 = paramConstraint.OooO0Oo;
          }
          localObject3 = paramConstraint.OooO0Oo;
          ((ConstraintSet.Motion)localObject3).OooOOO0 = i8;
          break label3869;
          localObject1 = paramConstraint.OooO0Oo;
          i5 = ((ConstraintSet.Motion)localObject1).OooOOO;
          k = paramTypedArray.getInteger(k, i5);
          ((ConstraintSet.Motion)localObject1).OooOOO0 = k;
        }
        break;
      case 85: 
        localObject1 = paramConstraint.OooO0Oo;
        f1 = ((ConstraintSet.Motion)localObject1).OooOO0;
        f3 = paramTypedArray.getFloat(k, f1);
        ((ConstraintSet.Motion)localObject1).OooOO0 = f3;
        break;
      case 84: 
        localObject1 = paramConstraint.OooO0Oo;
        i5 = ((ConstraintSet.Motion)localObject1).OooOO0O;
        k = paramTypedArray.getInteger(k, i5);
        ((ConstraintSet.Motion)localObject1).OooOO0O = k;
        break;
      case 83: 
        localObject1 = paramConstraint.OooO0o;
        i5 = ((ConstraintSet.Transform)localObject1).OooO;
        k = OooOo0o(paramTypedArray, k, i5);
        ((ConstraintSet.Transform)localObject1).OooO = k;
        break;
      case 82: 
        localObject1 = paramConstraint.OooO0Oo;
        i5 = ((ConstraintSet.Motion)localObject1).OooO0OO;
        k = paramTypedArray.getInteger(k, i5);
        ((ConstraintSet.Motion)localObject1).OooO0OO = k;
        break;
      case 81: 
        localObject1 = paramConstraint.OooO0o0;
        bool1 = ((ConstraintSet.Layout)localObject1).o00Ooo;
        m = paramTypedArray.getBoolean(k, bool1);
        ((ConstraintSet.Layout)localObject1).o00Ooo = m;
        break;
      case 80: 
        localObject1 = paramConstraint.OooO0o0;
        bool1 = ((ConstraintSet.Layout)localObject1).o00Oo0;
        n = paramTypedArray.getBoolean(m, bool1);
        ((ConstraintSet.Layout)localObject1).o00Oo0 = n;
        break;
      case 79: 
        localObject1 = paramConstraint.OooO0Oo;
        f1 = ((ConstraintSet.Motion)localObject1).OooO0oO;
        f3 = paramTypedArray.getFloat(n, f1);
        ((ConstraintSet.Motion)localObject1).OooO0oO = f3;
        break;
      case 78: 
        localObject1 = paramConstraint.OooO0OO;
        i6 = ((ConstraintSet.PropertySet)localObject1).OooO0OO;
        i1 = paramTypedArray.getInt(n, i6);
        ((ConstraintSet.PropertySet)localObject1).OooO0OO = i1;
        break;
      case 77: 
        localObject1 = paramConstraint.OooO0o0;
        localObject3 = paramTypedArray.getString(i1);
        ((ConstraintSet.Layout)localObject1).o00O0O = ((String)localObject3);
        break;
      case 76: 
        localObject1 = paramConstraint.OooO0Oo;
        i6 = ((ConstraintSet.Motion)localObject1).OooO0o0;
        i1 = paramTypedArray.getInt(i1, i6);
        ((ConstraintSet.Motion)localObject1).OooO0o0 = i1;
        break;
      case 75: 
        localObject1 = paramConstraint.OooO0o0;
        boolean bool2 = ((ConstraintSet.Layout)localObject1).o00o0O;
        i2 = paramTypedArray.getBoolean(i1, bool2);
        ((ConstraintSet.Layout)localObject1).o00o0O = i2;
        break;
      case 74: 
        localObject1 = paramConstraint.OooO0o0;
        localObject3 = paramTypedArray.getString(i2);
        ((ConstraintSet.Layout)localObject1).ooOO = ((String)localObject3);
        break;
      case 73: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OoooooO;
        i3 = paramTypedArray.getDimensionPixelSize(i2, i7);
        ((ConstraintSet.Layout)localObject1).OoooooO = i3;
        break;
      case 72: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).Oooooo;
        i3 = paramTypedArray.getInt(i3, i7);
        ((ConstraintSet.Layout)localObject1).Oooooo = i3;
        break;
      case 70: 
        localObject1 = paramConstraint.OooO0o0;
        f3 = paramTypedArray.getFloat(i3, f2);
        ((ConstraintSet.Layout)localObject1).Oooooo0 = f3;
        break;
      case 69: 
        localObject1 = paramConstraint.OooO0o0;
        f3 = paramTypedArray.getFloat(i3, f2);
        ((ConstraintSet.Layout)localObject1).OooooOo = f3;
        break;
      case 68: 
        localObject1 = paramConstraint.OooO0OO;
        f1 = ((ConstraintSet.PropertySet)localObject1).OooO0o0;
        f3 = paramTypedArray.getFloat(i3, f1);
        ((ConstraintSet.PropertySet)localObject1).OooO0o0 = f3;
        break;
      case 67: 
        localObject1 = paramConstraint.OooO0Oo;
        f1 = ((ConstraintSet.Motion)localObject1).OooO;
        f3 = paramTypedArray.getFloat(i3, f1);
        ((ConstraintSet.Motion)localObject1).OooO = f3;
        break;
      case 66: 
        localObject1 = paramConstraint.OooO0Oo;
        i3 = paramTypedArray.getInt(i3, 0);
        ((ConstraintSet.Motion)localObject1).OooO0o = i3;
        break;
      case 65: 
        localObject1 = paramTypedArray.peekValue(i3);
        i4 = ((TypedValue)localObject1).type;
        if (i4 == i9)
        {
          localObject1 = paramConstraint.OooO0Oo;
          localObject3 = paramTypedArray.getString(i3);
        }
        else
        {
          localObject1 = paramConstraint.OooO0Oo;
          localObject2 = Easing.OooO0OO;
          i3 = paramTypedArray.getInteger(i3, 0);
          localObject3 = localObject2[i3];
        }
        ((ConstraintSet.Motion)localObject1).OooO0Oo = ((String)localObject3);
        break;
      case 64: 
        localObject1 = paramConstraint.OooO0Oo;
        i7 = ((ConstraintSet.Motion)localObject1).OooO0O0;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Motion)localObject1).OooO0O0 = i3;
        break;
      case 63: 
        localObject1 = paramConstraint.OooO0o0;
        f1 = ((ConstraintSet.Layout)localObject1).OooOooO;
        f3 = paramTypedArray.getFloat(i3, f1);
        ((ConstraintSet.Layout)localObject1).OooOooO = f3;
        break;
      case 62: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOoo;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOoo = i3;
        break;
      case 61: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOoo0;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOoo0 = i3;
        break;
      case 60: 
        localObject1 = paramConstraint.OooO0o;
        f1 = ((ConstraintSet.Transform)localObject1).OooO0O0;
        f3 = paramTypedArray.getFloat(i3, f1);
        ((ConstraintSet.Transform)localObject1).OooO0O0 = f3;
        break;
      case 59: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooooOO;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).OooooOO = i3;
        break;
      case 58: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooooO0;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).OooooO0 = i3;
        break;
      case 57: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).Ooooo0o;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).Ooooo0o = i3;
        break;
      case 56: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).Ooooo00;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).Ooooo00 = i3;
        break;
      case 55: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OoooOoo;
        i3 = paramTypedArray.getInt(i3, i7);
        ((ConstraintSet.Layout)localObject1).OoooOoo = i3;
        break;
      case 54: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OoooOoO;
        i3 = paramTypedArray.getInt(i3, i7);
        ((ConstraintSet.Layout)localObject1).OoooOoO = i3;
        break;
      case 53: 
        localObject1 = paramConstraint.OooO0o;
        f1 = ((ConstraintSet.Transform)localObject1).OooOO0o;
        f3 = paramTypedArray.getDimension(i3, f1);
        ((ConstraintSet.Transform)localObject1).OooOO0o = f3;
        break;
      case 52: 
        localObject1 = paramConstraint.OooO0o;
        f1 = ((ConstraintSet.Transform)localObject1).OooOO0O;
        f3 = paramTypedArray.getDimension(i3, f1);
        ((ConstraintSet.Transform)localObject1).OooOO0O = f3;
        break;
      case 51: 
        localObject1 = paramConstraint.OooO0o;
        f1 = ((ConstraintSet.Transform)localObject1).OooOO0;
        f3 = paramTypedArray.getDimension(i3, f1);
        ((ConstraintSet.Transform)localObject1).OooOO0 = f3;
        break;
      case 50: 
        localObject1 = paramConstraint.OooO0o;
        f1 = ((ConstraintSet.Transform)localObject1).OooO0oo;
        f3 = paramTypedArray.getDimension(i3, f1);
        ((ConstraintSet.Transform)localObject1).OooO0oo = f3;
        break;
      case 49: 
        localObject1 = paramConstraint.OooO0o;
        f1 = ((ConstraintSet.Transform)localObject1).OooO0oO;
        f3 = paramTypedArray.getDimension(i3, f1);
        ((ConstraintSet.Transform)localObject1).OooO0oO = f3;
        break;
      case 48: 
        localObject1 = paramConstraint.OooO0o;
        f1 = ((ConstraintSet.Transform)localObject1).OooO0o;
        f3 = paramTypedArray.getFloat(i3, f1);
        ((ConstraintSet.Transform)localObject1).OooO0o = f3;
        break;
      case 47: 
        localObject1 = paramConstraint.OooO0o;
        f1 = ((ConstraintSet.Transform)localObject1).OooO0o0;
        f3 = paramTypedArray.getFloat(i3, f1);
        ((ConstraintSet.Transform)localObject1).OooO0o0 = f3;
        break;
      case 46: 
        localObject1 = paramConstraint.OooO0o;
        f1 = ((ConstraintSet.Transform)localObject1).OooO0Oo;
        f3 = paramTypedArray.getFloat(i3, f1);
        ((ConstraintSet.Transform)localObject1).OooO0Oo = f3;
        break;
      case 45: 
        localObject1 = paramConstraint.OooO0o;
        f1 = ((ConstraintSet.Transform)localObject1).OooO0OO;
        f3 = paramTypedArray.getFloat(i3, f1);
        ((ConstraintSet.Transform)localObject1).OooO0OO = f3;
        break;
      case 44: 
        localObject1 = paramConstraint.OooO0o;
        ((ConstraintSet.Transform)localObject1).OooOOO0 = i7;
        f1 = ((ConstraintSet.Transform)localObject1).OooOOO;
        f3 = paramTypedArray.getDimension(i3, f1);
        ((ConstraintSet.Transform)localObject1).OooOOO = f3;
        break;
      case 43: 
        localObject1 = paramConstraint.OooO0OO;
        f1 = ((ConstraintSet.PropertySet)localObject1).OooO0Oo;
        f3 = paramTypedArray.getFloat(i3, f1);
        ((ConstraintSet.PropertySet)localObject1).OooO0Oo = f3;
        break;
      case 42: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OoooOo0;
        i3 = paramTypedArray.getInt(i3, i7);
        ((ConstraintSet.Layout)localObject1).OoooOo0 = i3;
        break;
      case 41: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OoooOOo;
        i3 = paramTypedArray.getInt(i3, i7);
        ((ConstraintSet.Layout)localObject1).OoooOOo = i3;
        break;
      case 40: 
        localObject1 = paramConstraint.OooO0o0;
        f1 = ((ConstraintSet.Layout)localObject1).o000oOoO;
        f3 = paramTypedArray.getFloat(i3, f1);
        ((ConstraintSet.Layout)localObject1).o000oOoO = f3;
        break;
      case 39: 
        localObject1 = paramConstraint.OooO0o0;
        f1 = ((ConstraintSet.Layout)localObject1).OoooOOO;
        f3 = paramTypedArray.getFloat(i3, f1);
        ((ConstraintSet.Layout)localObject1).OoooOOO = f3;
        break;
      case 38: 
        i4 = paramConstraint.OooO00o;
        i3 = paramTypedArray.getResourceId(i3, i4);
        paramConstraint.OooO00o = i3;
        break;
      case 37: 
        localObject1 = paramConstraint.OooO0o0;
        f1 = ((ConstraintSet.Layout)localObject1).OooOoO;
        f3 = paramTypedArray.getFloat(i3, f1);
        ((ConstraintSet.Layout)localObject1).OooOoO = f3;
        break;
      case 36: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOOO;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOOO = i3;
        break;
      case 35: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOOOO;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOOOO = i3;
        break;
      case 34: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).Oooo0O0;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).Oooo0O0 = i3;
        break;
      case 33: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOo0O;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOo0O = i3;
        break;
      case 32: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOo0;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOo0 = i3;
        break;
      case 31: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).Oooo0o;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).Oooo0o = i3;
        break;
      case 30: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOOO0;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOOO0 = i3;
        break;
      case 29: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOO0o;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOO0o = i3;
        break;
      case 28: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).Oooo0;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).Oooo0 = i3;
        break;
      case 27: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).Oooo00O;
        i3 = paramTypedArray.getInt(i3, i7);
        ((ConstraintSet.Layout)localObject1).Oooo00O = i3;
        break;
      case 26: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOO0O;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOO0O = i3;
        break;
      case 25: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOO0;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOO0 = i3;
        break;
      case 24: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).Oooo00o;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).Oooo00o = i3;
        break;
      case 23: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooO0Oo;
        i3 = paramTypedArray.getLayoutDimension(i3, i7);
        ((ConstraintSet.Layout)localObject1).OooO0Oo = i3;
        break;
      case 22: 
        localObject1 = paramConstraint.OooO0OO;
        i7 = ((ConstraintSet.PropertySet)localObject1).OooO0O0;
        i3 = paramTypedArray.getInt(i3, i7);
        ((ConstraintSet.PropertySet)localObject1).OooO0O0 = i3;
        localObject3 = paramConstraint.OooO0OO;
        localObject1 = OooO0oo;
        i7 = ((ConstraintSet.PropertySet)localObject3).OooO0O0;
        i4 = localObject1[i7];
        ((ConstraintSet.PropertySet)localObject3).OooO0O0 = i4;
        break;
      case 21: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooO0o0;
        i3 = paramTypedArray.getLayoutDimension(i3, i7);
        ((ConstraintSet.Layout)localObject1).OooO0o0 = i3;
        break;
      case 20: 
        localObject1 = paramConstraint.OooO0o0;
        f1 = ((ConstraintSet.Layout)localObject1).OooOoO0;
        f3 = paramTypedArray.getFloat(i3, f1);
        ((ConstraintSet.Layout)localObject1).OooOoO0 = f3;
        break;
      case 19: 
        localObject1 = paramConstraint.OooO0o0;
        f1 = ((ConstraintSet.Layout)localObject1).OooO0oo;
        f3 = paramTypedArray.getFloat(i3, f1);
        ((ConstraintSet.Layout)localObject1).OooO0oo = f3;
        break;
      case 18: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooO0oO;
        i3 = paramTypedArray.getDimensionPixelOffset(i3, i7);
        ((ConstraintSet.Layout)localObject1).OooO0oO = i3;
        break;
      case 17: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooO0o;
        i3 = paramTypedArray.getDimensionPixelOffset(i3, i7);
        ((ConstraintSet.Layout)localObject1).OooO0o = i3;
        break;
      case 16: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).Oooo;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).Oooo = i3;
        break;
      case 15: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OoooO;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).OoooO = i3;
        break;
      case 14: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OoooO00;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).OoooO00 = i3;
        break;
      case 13: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).Oooo0oo;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).Oooo0oo = i3;
        break;
      case 12: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OoooO0O;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).OoooO0O = i3;
        break;
      case 11: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OoooO0;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).OoooO0 = i3;
        break;
      case 10: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOo0o;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOo0o = i3;
        break;
      case 9: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOo;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOo = i3;
        break;
      case 8: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).Oooo0o0;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).Oooo0o0 = i3;
        break;
      case 7: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).Oooo000;
        i3 = paramTypedArray.getDimensionPixelOffset(i3, i7);
        ((ConstraintSet.Layout)localObject1).Oooo000 = i3;
        break;
      case 6: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOooo;
        i3 = paramTypedArray.getDimensionPixelOffset(i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOooo = i3;
        break;
      case 5: 
        localObject1 = paramConstraint.OooO0o0;
        localObject3 = paramTypedArray.getString(i3);
        ((ConstraintSet.Layout)localObject1).OooOoOO = ((String)localObject3);
        break;
      case 4: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOOOo;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOOOo = i3;
        break;
      case 3: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOOo0;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOOo0 = i3;
        break;
      case 2: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).Oooo0OO;
        i3 = paramTypedArray.getDimensionPixelSize(i3, i7);
        ((ConstraintSet.Layout)localObject1).Oooo0OO = i3;
        break;
      case 1: 
        localObject1 = paramConstraint.OooO0o0;
        i7 = ((ConstraintSet.Layout)localObject1).OooOOo;
        i3 = OooOo0o(paramTypedArray, i3, i7);
        ((ConstraintSet.Layout)localObject1).OooOOo = i3;
      }
      label3869:
      j += 1;
    }
    paramContext = paramConstraint.OooO0o0;
    paramConstraint = paramContext.ooOO;
    if (paramConstraint != null)
    {
      paramConstraint = null;
      paramContext.o0OoOo0 = null;
    }
  }
  
  public void OooOoo(ConstraintLayout paramConstraintLayout)
  {
    int i = paramConstraintLayout.getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = paramConstraintLayout.getChildAt(j);
      Object localObject1 = (ConstraintLayout.LayoutParams)localView.getLayoutParams();
      int k = localView.getId();
      boolean bool3 = this.OooO0o;
      if (bool3)
      {
        int n = -1;
        if (k == n)
        {
          paramConstraintLayout = new java/lang/RuntimeException;
          paramConstraintLayout.<init>("All children of ConstraintLayout must have ids to use ConstraintSet");
          throw paramConstraintLayout;
        }
      }
      Object localObject2 = this.OooO0oO;
      Object localObject3 = Integer.valueOf(k);
      boolean bool4 = ((HashMap)localObject2).containsKey(localObject3);
      if (!bool4)
      {
        localObject2 = this.OooO0oO;
        localObject3 = Integer.valueOf(k);
        ConstraintSet.Constraint localConstraint = new androidx/constraintlayout/widget/ConstraintSet$Constraint;
        localConstraint.<init>();
        ((HashMap)localObject2).put(localObject3, localConstraint);
      }
      localObject2 = this.OooO0oO;
      localObject3 = Integer.valueOf(k);
      localObject2 = (ConstraintSet.Constraint)((HashMap)localObject2).get(localObject3);
      if (localObject2 != null)
      {
        localObject3 = ((ConstraintSet.Constraint)localObject2).OooO0o0;
        boolean bool5 = ((ConstraintSet.Layout)localObject3).OooO0O0;
        boolean bool7 = true;
        if (!bool5)
        {
          ConstraintSet.Constraint.OooO00o((ConstraintSet.Constraint)localObject2, k, (ConstraintLayout.LayoutParams)localObject1);
          boolean bool8 = localView instanceof ConstraintHelper;
          if (bool8)
          {
            localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0o0;
            Object localObject4 = localView;
            localObject4 = ((ConstraintHelper)localView).getReferencedIds();
            ((ConstraintSet.Layout)localObject1).o0OoOo0 = ((int[])localObject4);
            bool8 = localView instanceof Barrier;
            if (bool8)
            {
              localObject1 = localView;
              localObject1 = (Barrier)localView;
              localObject4 = ((ConstraintSet.Constraint)localObject2).OooO0o0;
              bool5 = ((Barrier)localObject1).getAllowsGoneWidget();
              ((ConstraintSet.Layout)localObject4).o00o0O = bool5;
              localObject4 = ((ConstraintSet.Constraint)localObject2).OooO0o0;
              int i1 = ((Barrier)localObject1).getType();
              ((ConstraintSet.Layout)localObject4).Oooooo = i1;
              localObject4 = ((ConstraintSet.Constraint)localObject2).OooO0o0;
              int i2 = ((Barrier)localObject1).getMargin();
              ((ConstraintSet.Layout)localObject4).OoooooO = i2;
            }
          }
          localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0o0;
          ((ConstraintSet.Layout)localObject1).OooO0O0 = bool7;
        }
        localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0OO;
        boolean bool1 = ((ConstraintSet.PropertySet)localObject1).OooO00o;
        float f1;
        if (!bool1)
        {
          int m = ((View)localView).getVisibility();
          ((ConstraintSet.PropertySet)localObject1).OooO0O0 = m;
          localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0OO;
          f1 = ((View)localView).getAlpha();
          ((ConstraintSet.PropertySet)localObject1).OooO0Oo = f1;
          localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0OO;
          ((ConstraintSet.PropertySet)localObject1).OooO00o = bool7;
        }
        localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0o;
        boolean bool2 = ((ConstraintSet.Transform)localObject1).OooO00o;
        if (!bool2)
        {
          ((ConstraintSet.Transform)localObject1).OooO00o = bool7;
          f1 = ((View)localView).getRotation();
          ((ConstraintSet.Transform)localObject1).OooO0O0 = f1;
          localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0o;
          f1 = ((View)localView).getRotationX();
          ((ConstraintSet.Transform)localObject1).OooO0OO = f1;
          localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0o;
          f1 = ((View)localView).getRotationY();
          ((ConstraintSet.Transform)localObject1).OooO0Oo = f1;
          localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0o;
          f1 = ((View)localView).getScaleX();
          ((ConstraintSet.Transform)localObject1).OooO0o0 = f1;
          localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0o;
          f1 = ((View)localView).getScaleY();
          ((ConstraintSet.Transform)localObject1).OooO0o = f1;
          float f2 = ((View)localView).getPivotX();
          f1 = ((View)localView).getPivotY();
          double d1 = f2;
          double d2 = 0.0D;
          boolean bool6 = d1 < d2;
          if (!bool6)
          {
            d1 = f1;
            bool6 = d1 < d2;
            if (!bool6) {}
          }
          else
          {
            localObject3 = ((ConstraintSet.Constraint)localObject2).OooO0o;
            ((ConstraintSet.Transform)localObject3).OooO0oO = f2;
            ((ConstraintSet.Transform)localObject3).OooO0oo = f1;
          }
          localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0o;
          f1 = ((View)localView).getTranslationX();
          ((ConstraintSet.Transform)localObject1).OooOO0 = f1;
          localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0o;
          f1 = ((View)localView).getTranslationY();
          ((ConstraintSet.Transform)localObject1).OooOO0O = f1;
          localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0o;
          f1 = ((View)localView).getTranslationZ();
          ((ConstraintSet.Transform)localObject1).OooOO0o = f1;
          localObject1 = ((ConstraintSet.Constraint)localObject2).OooO0o;
          bool2 = ((ConstraintSet.Transform)localObject1).OooOOO0;
          if (bool2)
          {
            float f3 = ((View)localView).getElevation();
            ((ConstraintSet.Transform)localObject1).OooOOO = f3;
          }
        }
      }
      j += 1;
    }
  }
  
  public void OooOooO(ConstraintSet paramConstraintSet)
  {
    Iterator localIterator = paramConstraintSet.OooO0oO.keySet().iterator();
    Object localObject1;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    do
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Integer)localIterator.next();
      int i = ((Integer)localObject1).intValue();
      localObject1 = (ConstraintSet.Constraint)paramConstraintSet.OooO0oO.get(localObject1);
      localObject2 = this.OooO0oO;
      localObject3 = Integer.valueOf(i);
      boolean bool2 = ((HashMap)localObject2).containsKey(localObject3);
      if (!bool2)
      {
        localObject2 = this.OooO0oO;
        localObject3 = Integer.valueOf(i);
        localObject4 = new androidx/constraintlayout/widget/ConstraintSet$Constraint;
        ((ConstraintSet.Constraint)localObject4).<init>();
        ((HashMap)localObject2).put(localObject3, localObject4);
      }
      localObject2 = this.OooO0oO;
      localObject5 = Integer.valueOf(i);
      localObject5 = (ConstraintSet.Constraint)((HashMap)localObject2).get(localObject5);
    } while (localObject5 == null);
    Object localObject2 = ((ConstraintSet.Constraint)localObject5).OooO0o0;
    boolean bool3 = ((ConstraintSet.Layout)localObject2).OooO0O0;
    if (!bool3)
    {
      localObject3 = ((ConstraintSet.Constraint)localObject1).OooO0o0;
      ((ConstraintSet.Layout)localObject2).OooO00o((ConstraintSet.Layout)localObject3);
    }
    localObject2 = ((ConstraintSet.Constraint)localObject5).OooO0OO;
    bool3 = ((ConstraintSet.PropertySet)localObject2).OooO00o;
    if (!bool3)
    {
      localObject3 = ((ConstraintSet.Constraint)localObject1).OooO0OO;
      ((ConstraintSet.PropertySet)localObject2).OooO00o((ConstraintSet.PropertySet)localObject3);
    }
    localObject2 = ((ConstraintSet.Constraint)localObject5).OooO0o;
    bool3 = ((ConstraintSet.Transform)localObject2).OooO00o;
    if (!bool3)
    {
      localObject3 = ((ConstraintSet.Constraint)localObject1).OooO0o;
      ((ConstraintSet.Transform)localObject2).OooO00o((ConstraintSet.Transform)localObject3);
    }
    localObject2 = ((ConstraintSet.Constraint)localObject5).OooO0Oo;
    bool3 = ((ConstraintSet.Motion)localObject2).OooO00o;
    if (!bool3)
    {
      localObject3 = ((ConstraintSet.Constraint)localObject1).OooO0Oo;
      ((ConstraintSet.Motion)localObject2).OooO00o((ConstraintSet.Motion)localObject3);
    }
    localObject2 = ((ConstraintSet.Constraint)localObject1).OooO0oO.keySet().iterator();
    for (;;)
    {
      bool3 = ((Iterator)localObject2).hasNext();
      if (!bool3) {
        break;
      }
      localObject3 = (String)((Iterator)localObject2).next();
      localObject4 = ((ConstraintSet.Constraint)localObject5).OooO0oO;
      boolean bool4 = ((HashMap)localObject4).containsKey(localObject3);
      if (!bool4)
      {
        localObject4 = ((ConstraintSet.Constraint)localObject5).OooO0oO;
        ConstraintAttribute localConstraintAttribute = (ConstraintAttribute)((ConstraintSet.Constraint)localObject1).OooO0oO.get(localObject3);
        ((HashMap)localObject4).put(localObject3, localConstraintAttribute);
      }
    }
  }
  
  public boolean getApplyElevation(int paramInt)
  {
    return get(paramInt).OooO0o.OooOOO0;
  }
  
  public ConstraintSet.Constraint getConstraint(int paramInt)
  {
    HashMap localHashMap = this.OooO0oO;
    Integer localInteger1 = Integer.valueOf(paramInt);
    boolean bool = localHashMap.containsKey(localInteger1);
    if (bool)
    {
      localHashMap = this.OooO0oO;
      Integer localInteger2 = Integer.valueOf(paramInt);
      return (ConstraintSet.Constraint)localHashMap.get(localInteger2);
    }
    return null;
  }
  
  public HashMap getCustomAttributeSet()
  {
    return this.OooO0o0;
  }
  
  public int getHeight(int paramInt)
  {
    return get(paramInt).OooO0o0.OooO0o0;
  }
  
  public int[] getKnownIds()
  {
    Object localObject1 = this.OooO0oO.keySet();
    int i = 0;
    Integer[] arrayOfInteger = new Integer[0];
    localObject1 = (Integer[])((Set)localObject1).toArray(arrayOfInteger);
    int j = localObject1.length;
    int[] arrayOfInt = new int[j];
    while (i < j)
    {
      Object localObject2 = localObject1[i];
      int k = localObject2.intValue();
      arrayOfInt[i] = k;
      i += 1;
    }
    return arrayOfInt;
  }
  
  public ConstraintSet.Constraint getParameters(int paramInt)
  {
    return get(paramInt);
  }
  
  public int[] getReferencedIds(int paramInt)
  {
    int[] arrayOfInt = get(paramInt).OooO0o0.o0OoOo0;
    if (arrayOfInt == null) {
      return new int[0];
    }
    int i = arrayOfInt.length;
    return Arrays.copyOf(arrayOfInt, i);
  }
  
  public int getVisibility(int paramInt)
  {
    return get(paramInt).OooO0OO.OooO0O0;
  }
  
  public int getVisibilityMode(int paramInt)
  {
    return get(paramInt).OooO0OO.OooO0OO;
  }
  
  public int getWidth(int paramInt)
  {
    return get(paramInt).OooO0o0.OooO0Oo;
  }
  
  public boolean isForceId()
  {
    return this.OooO0o;
  }
  
  public void setAlpha(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0OO.OooO0Oo = paramFloat;
  }
  
  public void setApplyElevation(int paramInt, boolean paramBoolean)
  {
    get(paramInt).OooO0o.OooOOO0 = paramBoolean;
  }
  
  public void setBarrierType(int paramInt1, int paramInt2)
  {
    get(paramInt1).OooO0o0.Ooooooo = paramInt2;
  }
  
  public void setDimensionRatio(int paramInt, String paramString)
  {
    get(paramInt).OooO0o0.OooOoOO = paramString;
  }
  
  public void setEditorAbsoluteX(int paramInt1, int paramInt2)
  {
    get(paramInt1).OooO0o0.OooOooo = paramInt2;
  }
  
  public void setEditorAbsoluteY(int paramInt1, int paramInt2)
  {
    get(paramInt1).OooO0o0.Oooo000 = paramInt2;
  }
  
  public void setElevation(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o.OooOOO = paramFloat;
    get(paramInt).OooO0o.OooOOO0 = true;
  }
  
  public void setForceId(boolean paramBoolean)
  {
    this.OooO0o = paramBoolean;
  }
  
  public void setGuidelineBegin(int paramInt1, int paramInt2)
  {
    get(paramInt1).OooO0o0.OooO0o = paramInt2;
    get(paramInt1).OooO0o0.OooO0oO = -1;
    get(paramInt1).OooO0o0.OooO0oo = -1.0F;
  }
  
  public void setGuidelineEnd(int paramInt1, int paramInt2)
  {
    get(paramInt1).OooO0o0.OooO0oO = paramInt2;
    get(paramInt1).OooO0o0.OooO0o = -1;
    get(paramInt1).OooO0o0.OooO0oo = -1.0F;
  }
  
  public void setGuidelinePercent(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o0.OooO0oo = paramFloat;
    ConstraintSet.Layout localLayout = get(paramInt).OooO0o0;
    int i = -1;
    localLayout.OooO0oO = i;
    get(paramInt).OooO0o0.OooO0o = i;
  }
  
  public void setHorizontalBias(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o0.OooOoO0 = paramFloat;
  }
  
  public void setHorizontalChainStyle(int paramInt1, int paramInt2)
  {
    get(paramInt1).OooO0o0.OoooOOo = paramInt2;
  }
  
  public void setHorizontalWeight(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o0.OoooOOO = paramFloat;
  }
  
  public void setLayoutWrapBehavior(int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0)
    {
      int i = 3;
      if (paramInt2 <= i)
      {
        ConstraintSet.Layout localLayout = get(paramInt1).OooO0o0;
        localLayout.o00ooo = paramInt2;
      }
    }
  }
  
  public void setReferencedIds(int paramInt, int... paramVarArgs)
  {
    get(paramInt).OooO0o0.o0OoOo0 = paramVarArgs;
  }
  
  public void setRotation(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o.OooO0O0 = paramFloat;
  }
  
  public void setRotationX(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o.OooO0OO = paramFloat;
  }
  
  public void setRotationY(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o.OooO0Oo = paramFloat;
  }
  
  public void setScaleX(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o.OooO0o0 = paramFloat;
  }
  
  public void setScaleY(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o.OooO0o = paramFloat;
  }
  
  public void setTransformPivotX(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o.OooO0oO = paramFloat;
  }
  
  public void setTransformPivotY(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o.OooO0oo = paramFloat;
  }
  
  public void setTranslationX(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o.OooOO0 = paramFloat;
  }
  
  public void setTranslationY(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o.OooOO0O = paramFloat;
  }
  
  public void setTranslationZ(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o.OooOO0o = paramFloat;
  }
  
  public void setValidateOnParse(boolean paramBoolean)
  {
    this.OooO00o = paramBoolean;
  }
  
  public void setVerticalBias(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o0.OooOoO = paramFloat;
  }
  
  public void setVerticalChainStyle(int paramInt1, int paramInt2)
  {
    get(paramInt1).OooO0o0.OoooOo0 = paramInt2;
  }
  
  public void setVerticalWeight(int paramInt, float paramFloat)
  {
    get(paramInt).OooO0o0.o000oOoO = paramFloat;
  }
  
  public void setVisibility(int paramInt1, int paramInt2)
  {
    get(paramInt1).OooO0OO.OooO0O0 = paramInt2;
  }
  
  public void setVisibilityMode(int paramInt1, int paramInt2)
  {
    get(paramInt1).OooO0OO.OooO0OO = paramInt2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet
 * JD-Core Version:    0.7.0.1
 */