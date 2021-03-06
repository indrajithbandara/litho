/*
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.litho.sections.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * The method annotated with this annotation will be called when the Service has been
 * transferred from the old tree to the new tree. This means that this SectionComponent should unset
 * any listener previously set on the Service.
 *
 * <p>For example:
 * <pre>
 * {@code
 *
 * @DiffSectionSpec
 * public class MyChangeSetSpec {
 *
 *   @OnUnbindServices
 *   protected void onUnbindService(
 *     SectionContext c,
 *     SomeService myService,
 *     @Prop SomeProp prop) {
 *     myService.unregisterListener(...);
 *   }
 * }
 * }
 * </pre>
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface OnUnbindService {

}
