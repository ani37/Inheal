# Inheal<a href="https://github.com/ani37/Inheal/blob/main/Pictures/logo.jpg"><img src="https://github.com/ani37/Inheal/blob/main/Pictures/logo.jpg" alt="Frame-9" border="0" width = "300"></a>
### Table of Contents
* About the Product
	* Built With
	* Research and Implementation
* Business Model
  * Target Audience.
* Video
* Execution for model
__________
### About the Product
Inheal is a healthcare solution which seeks to reduce patients waiting time (at hospitals queue). Our clients are the hospitals, health insurance companies and the users are the patients and doctors.It also makes the communication between doctors and patients much easier. 

The patient types what he is feeling on our app (e.g. "My chests hurts" or "I have a knee pain when i walk a lot") and then via Natural Language Processing the symptoms are classified into a medical specialty (e.g. "Orthopedist" or "Gastroenterologist"). The app also gathers information such as patients location. The classification will be compared to a database of hospitals and the closest one that has physicians from that specialty will be indicated.

If the patient decides to go to that hospital, a QR code is generated. The hospital receives an alert on its integrated system and when the patient arrives it simply scans the QR code and he/she will be directed to the correct hospitals wing.
_________

#### Built with
<a href="https://github.com/ani37/Inheal/blob/main/Pictures/tech.jpg"><img src="https://github.com/ani37/Inheal/blob/main/Pictures/tech.jpg" alt="Frame-7" border="0"></a>
____

#### Research and Implementation

The NLP was implemented making use of SKLearn (Python3). A simple interface was created as well as a SQL database. 

4 ML algorithms were implemented: Decision Tree, Random Forest, Multi-Layer Perceptron and K-Nearest Neighbours. 

Each of them is trained with 60% of the original dataset and tested with the other 40%. The one that performs best (higher accuracy) will be used as the final classifier. 

The dataset used is an adaption from [Medical Speech Transcription and Intent Data](https://www.kaggle.com/paultimothymooney/medical-speech-transcription-and-intent/kernels) and the given CSV data sample.

In summary, we applied:

- [x] NLP = Removal of stop words, count vectorizer and tdidf.
- [x] ML = Decision Tree, Random Forest, Multi-Layer Perceptron and K-Nearest Neighbours
- [x] Simplified interface
- [x] Simplified database

![](https://github.com/ani37/Inheal/blob/main/Pictures/exampleExecution.png)

________
#### Business model

The second largest complaint (80%) of patients regarding health operators is the time spent on the Emergency Room’s waiting line.

One of the factors considered, for example, is patient satisfaction. After identifying this  issue, we were able to create a distributed data management platform that optimizes queue time and improves communication  between the Health Insurance Companies and the Hospitals. We developed an application in which the patient reports the symptoms and through AI (NLP) it is detected the required medical speciality and the nearest doctor or hospital available by the health insurance.
Currently there are competitive applications, but they do not deliver the solution in an app platform to various health insurances and do not use AI.

Our costumers will be paying for the service monthly.

_________

#### Target Audience
* Patients.
* People in rural areas as mostly they are unaware of health service providers
* Majority of the audience are senior citizens ,and with getting old comes health issues therefore our main focus are the senior citizens
* or any person suffering from health disease
________

#### Video Submission

Here is a video about our product. Please click on the image to view the video.

[![Inheal](https://github.com/ani37/Inheal/blob/main/Pictures/logo.jpg)](https://drive.google.com/file/d/1EGdYy2HOTuDjqfU1L46zXDl2-atrNPAa/view?usp=sharing "Inheal")

Visit [here](https://github.com/ani37/Inheal/blob/main/Pictures) for Prototype images.
________

#### Execution for model
```bash
> pip3 install -r requirements.txt
> python3 interface.py -i overview-of-recordings-especialists.csv 
```
________

Authored By: Aniket Agarwalla

Department of Computer Science and Engineering <br>
National Institute of Technology Silchar <br>

________
