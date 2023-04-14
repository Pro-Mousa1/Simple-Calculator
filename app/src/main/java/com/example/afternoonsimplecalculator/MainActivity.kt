package com.example.afternoonsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Instantiate the elements on the user interface as variables
    lateinit var mAnswer:TextView
    lateinit var mFnum:EditText
    lateinit var mSnum:EditText
    lateinit var mAdd:Button
    lateinit var mSub:Button
    lateinit var mDiv:Button
    lateinit var mMul:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAnswer =  findViewById(R.id.mTvAnswer)
        mFnum = findViewById(R.id.mEditFnum)
        mSnum = findViewById(R.id.mEditSnum)
        mAdd = findViewById(R.id.mBtnAdd)
        mSub = findViewById(R.id.mBtnSub)
        mDiv = findViewById(R.id.mBtnDiv)
        mMul = findViewById(R.id.mBtnMul)
        // Set onClick listeners on buttons
        mAdd.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                // Display an error message on textView answer
                mAnswer.text = "Please enter valid numbers!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                // Display the result on the textView answer
                mAnswer.text = jibu.toString()
            }
        }
        mSub.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                // Display an error message on textView answer
                mAnswer.text = "Please enter valid numbers!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                // Display the result on the textView answer
                mAnswer.text = jibu.toString()
            }
        }
        mDiv.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                // Display an error message on textView answer
                mAnswer.text = "Please enter valid numbers!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                // Display the result on the textView answer
                mAnswer.text = jibu.toString()
            }
        }
        mMul.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                // Display an error message on textView answer
                mAnswer.text = "Please enter valid numbers!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                // Display the result on the textView answer
                mAnswer.text = jibu.toString()
            }
        }
    }
}