package com.example.mentalcalculation.data

enum class Operator() {
    PLUS {
        override fun getOperatorChar() = '+'
    },
    MINUS{
        override fun getOperatorChar() = '-'
    },
    DIVIDE{
        override fun getOperatorChar() = '/'
    },
    MULTIPLY{
        override fun getOperatorChar() = 'x'
    };

    abstract fun getOperatorChar(): Char
}
