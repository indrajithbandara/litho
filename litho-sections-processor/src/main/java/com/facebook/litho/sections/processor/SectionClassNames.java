/**
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.litho.sections.processor;

import com.squareup.javapoet.ClassName;

/**
 * To avoid referring to classes directly in the processor (which would be a circular dependency and
 * would mean the annotation processor might need to process Android-specific class definitions)
 * we provide class name constants instead.
 */
public class SectionClassNames {

  public static final ClassName STATE_CONTAINER_SECTION =
      ClassName.bestGuess("com.facebook.litho.sections.SectionLifecycle.StateContainer");
  public static final ClassName SECTION =
      ClassName.bestGuess("com.facebook.litho.sections.Section");
  public static final ClassName SECTION_LIFECYCLE =
      ClassName.bestGuess("com.facebook.litho.sections.SectionLifecycle");
  public static final ClassName SECTION_CONTEXT =
      ClassName.bestGuess("com.facebook.litho.sections.SectionContext");
  public static final ClassName CHANGESET =
      ClassName.bestGuess("com.facebook.litho.sections.ChangeSet");
  public static final ClassName LIST = ClassName.bestGuess("java.util.List");
  public static final ClassName SECTION_STATE_UPDATE =
      ClassName.bestGuess("com.facebook.litho.sections.SectionLifecycle.StateUpdate");
  public static final ClassName LOADING_EVENT_HANDLER =
      ClassName.bestGuess("com.facebook.litho.sections.LoadingEvent");
  public static final ClassName CHILDREN =
      ClassName.bestGuess("com.facebook.litho.sections.Children");
}
