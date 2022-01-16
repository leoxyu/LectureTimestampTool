# 𝐿𝑒𝑐𝑡𝑢𝑟𝑒 𝑇𝑖𝑚𝑒𝑠𝑡𝑎𝑚𝑝 𝑇𝑜𝑜𝑙

## Who contributed?
<pre>
      _    
     c ". 
\_   /\\  
  \_| ||  𝑈𝑛𝑖𝑡𝑒𝑑 𝑀𝑜𝑛𝑘𝑒𝑦𝑠 𝐴𝑔𝑎𝑖𝑛𝑠𝑡 𝐼𝑛𝑓𝑖𝑛𝑖𝑡𝑒 𝑅𝑒𝑐𝑢𝑟𝑠𝑖𝑜𝑛 (𝑈𝑀𝐴𝐼𝑅)
</pre>

* Leo Yu
* Ayyan Qamer
* Ammad Hussain
* James Chen
* Ali Rafiei
* Aly Umair

## What is our inspiration?
COVID-19 has been especially hard for all of us. Being a student has been difficult with the sudden change to online learning and has burdened students throughout their university careers. One of the biggest challenges of online education is the consumption of online lectures. Our project aims to solve this problem. We have created a tool that will enhance and optimize the way students digest their online education and lecture videos. 

## What does it do?
The Lecture Timestamp Tool will take your online lecture video, and will essentially output time stamps for each change in lecture slides into a text file. The video file will be automatically compressed in order to collect the frames while maintaing a low run time. Then the program compares whether a slide has changed or not. If a threshold difference between frames is met, then a timestamp will be taken of the video, and collected in the specified text file. 

## How does it work?
Our program works by separating the video into individual frames, and detecting the percentage of change within red, blue, and green pixels of each frame. This can be quite costly for a program if the image quality is in a standard 1080p. To solve this problem, we compressed the input video into a low image quality render and increased the speed in order to decrease run time of the program.

## Challenges we ran into?
When we first began working on the program, our intentions were to use OpenCV to analyze the video. However, we soon had compatibility issues with what we wanted to do and what resources we had available to figure out how to meet the requirements we wanted. We then used Maven due to larger database of resources and increased compatability for what we wanted to do. Once we had our Maven libraries researched and understood, we set off to coding.

## What we learned?
1. Many of us were new to both Java and the libraries like OpenCV and Maven. This proved to be a challenge when time was especially of the essence. 
2. We learned that teamwork is essential for a getting a large project like ours done in 24 hours
3. Blood, Sweat, Tears, and lack of sleep is what makes good programs 

## Built with?
* [IntelliJ IDEA](https://www.jetbrains.com/idea/)
* [JavaCV](https://github.com/bytedeco/javacv)
* [Maven](https://maven.apache.org/)

## License
MIT License

Copyright (c) [2022] [Leo Yu, Ali Rafiei, James Chen, Ayyan Qamer, Ammad Hussain, Aly Umair]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
