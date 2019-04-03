/*
 * Copyright (c) 2019 toastkidjp.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompany this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html.
 */
package jp.toastkid.spekexample

import org.spekframework.spek2.Spek
import org.spekframework.spek2.dsl.Skip
import org.spekframework.spek2.style.specification.xdescribe

/**
 * @author toastkidjp
 */
class SpekExample : Spek({

    beforeGroup {
        println("before group")
    }

    beforeEachTest {
        println("before test")
    }

    group("Group1") {
        test ("Group1-1") {
            println("test1-1")
        }
        test ("Group1-2", skip = Skip.No) {
            println("test1-2")
        }
    }

    group("Group2") {
        xdescribe ("Group2-1") {
            println("test2-1")
        }
    }

    afterGroup {
        println("after group")
    }

    afterEachTest {
        println("after test")
    }

})