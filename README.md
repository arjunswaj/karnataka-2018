### Inspiration
Back in 2014, I had written a kickass [scraper script](https://github.com/arjunswaj/loksabha2014/tree/master/DataCollection/src/com/asb/analysis) and [SQL queries](https://github.com/arjunswaj/loksabha2014/blob/master/Reports/queries.sql) to do analysis of Lok Sabha Elections. From 2014, not a lot has changed in the election commission's [results website](http://eciresults.nic.in). I ran the script [again](https://github.com/arjunswaj/uugpm2017) for the election results of the states - Uttar Pradesh, Uttarakhand, Goa, Manipur and Punjab were announced and had added some [IOMonads](https://github.com/arjunswaj/uugpm2017/blob/master/src/com/asb/elections/Scraper.java#L28-L35) to make the running of the script more fun. 
Today when Karnataka election results were announced, I ran this again. Surprisingly, the SQL and the scraper worked flawlessly! Without making you wait further, I shall share the results below:

Totally **78** Parties took part in the election!

#### Top 5 parties with maximum number of seats

PARTY | SEATS
------------ | -------------
BHARATIYA JANATA PARTY|104
INDIAN NATIONAL CONGRESS|77
JANATA DAL (SECULAR)|37
INDEPENDENT|1
BAHUJAN SAMAJ PARTY|1
KARNATAKA PRAGNYAVANTHA JANATHA PARTY|1


Well, everyone knows that isnt it? Lets see top 5 parties with maximum number of 2nd place.

#### Top 7 parties with maximum number of 2nd place

PARTY | SEATS
------------ | -------------
INDIAN NATIONAL CONGRESS|110
BHARATIYA JANATA PARTY|65
JANATA DAL (SECULAR)|37
INDEPENDENT|6
COMMUNIST PARTY OF INDIA (MARXIST)|1
SWARAJ INDIA|1
BHARATIYA PRAJA PAKSHA|1


#### Which party fielded maximum number of candidates?

NO. OF CANDIDATES | PARTY
------------ | -------------
1127|INDEPENDENT
221|BHARATIYA JANATA PARTY
216|INDIAN NATIONAL CONGRESS
199|JANATA DAL (SECULAR)
173|ALL INDIA MAHILA EMPOWERMENT PARTY
37|SHIVSENA
 
#### Well, Well, Who got maximum number of votes?

CANDIDATE | PARTY | CONSTITUENCY | VOTES
------------ | ------------- | ------------ | -------------
M KRISHNAPPA|BHARATIYA JANATA PARTY|BANGALORE SOUTH|152469
ARAVIND LIMBAVALI|BHARATIYA JANATA PARTY|MAHADEVAPURA|141682
B.A.BASAVARAJA|INDIAN NATIONAL CONGRESS|K.R.PURA|135404
D K SHIVAKUMAR|INDIAN NATIONAL CONGRESS|KANAKAPURA|127552
A C SRINIVASA|INDIAN NATIONAL CONGRESS|MAHADEVAPURA|123898

Almost all in Bangalore!

#### Which constituency had maximum number of votes casted?

STATE | CONSTITUENCY | VOTES
------------ | ------------- | ------------
KARNATAKA|BANGALORE SOUTH|331348
KARNATAKA|YESHVANTHAPURA|287205
KARNATAKA|MAHADEVAPURA|284352
KARNATAKA|K.R.PURA|253994
KARNATAKA|BYATARAYANAPURA|253709


#### Let us look at the vote shares of Top 10 parties.

PARTY | VOTES | TOTAL VOTES | VOTE SHARE
------------ | ------------- | ------------ | ------------
INDIAN NATIONAL CONGRESS|13611928|36064138|0.3774
BHARATIYA JANATA PARTY|13090424|36064138|0.3630
JANATA DAL (SECULAR)|6666240|36064138|0.1848
INDEPENDENT|1435656|36064138|0.0398
NONE OF THE ABOVE|321598|36064138|0.0089
BAHUJAN SAMAJ PARTY|102180|36064138|0.0028
ALL INDIA MAHILA EMPOWERMENT PARTY|97295|36064138|0.0027
BHARATIYA PRAJA PAKSHA|83071|36064138|0.0023
COMMUNIST PARTY OF INDIA (MARXIST)|81191|36064138|0.0023
SWARAJ INDIA|79400|36064138|0.0022

#### Who were the undisputed winners of 2018?

CANDIDATE | PARTY | CONSTITUENCY | VOTES | TOTAL VOTES | VOTE SHARE
------------ | ------------- | ------------ | ------------ | ------------ | -------------
R. AKHANDA SRINIVASAMURTHY|INDIAN NATIONAL CONGRESS|PULAKESHINAGAR|97574|126432|0.7718
D K SHIVAKUMAR|INDIAN NATIONAL CONGRESS|KANAKAPURA|127552|186152|0.6852
DR. ASHWATH NARAYAN.C.N.|BHARATIYA JANATA PARTY|MALLESHWARAM|83130|123665|0.6722
HALADY SRINIVAS SHETTY|BHARATIYA JANATA PARTY|KUNDAPURA|103434|158644|0.6520
D.C.THAMMANNA|JANATA DAL (SECULAR)|MADDUR|109239|172095|0.6348
C N BALAKRISHNA|JANATA DAL (SECULAR)|SHRAVANABELAGOLA|105516|167261|0.6308
V. SUNIL KUMAR|BHARATIYA JANATA PARTY|KARKAL|91245|145935|0.6252
SURESH GOWDAA|JANATA DAL (SECULAR)|NAGAMANGALA|112396|181472|0.6194
K.J GEORGE|INDIAN NATIONAL CONGRESS|SARVAGNANAGAR|109955|178091|0.6174
A. MANJUNATH|JANATA DAL (SECULAR)|MAGADI|119492|194218|0.6152


#### Who lost the maximum deposit?
     
No. of seats with < 1/6 votes

NO. OF CANDIDATES | PARTY 
------------ | ------------- 
1112|INDEPENDENT
221|NONE OF THE ABOVE
173|ALL INDIA MAHILA EMPOWERMENT PARTY
107|JANATA DAL (SECULAR)
37|SHIVSENA
36|BHARATIYA JANATA PARTY
32|INDIAN NEW CONGRESS PARTY
29|REPUBLICAN SENA
29|KARNATAKA PRAGNYAVANTHA JANATHA PARTY
28|AAM AADMI PARTY


#### Who won with maximum difference in votes?

CONSTITUENCY | WINNING CANDIDATE | WINNING PARTY | WINNER VOTES | RUNNER UP CANDIDATE | RUNNER UP PARTY | RUNNER UP VOTES | DIFFERENCE IN VOTES 
------------ | ------------- | ------------ | ------------- | ------------ | ------------- | ------------ | ------------- 
PULAKESHINAGAR|R. AKHANDA SRINIVASAMURTHY|INDIAN NATIONAL CONGRESS|97574|B. PRASANNAKUMAR|JANATA DAL (SECULAR)|15948|81626
KANAKAPURA|D K SHIVAKUMAR|INDIAN NATIONAL CONGRESS|127552|NARAYANA GOWDA|JANATA DAL (SECULAR)|47643|79909
BELGAUM DAKSHIN|ABHAY PATIL|BHARATIYA JANATA PARTY|84498|M D LAKSHMINARAYAN (ANNAYYA)|INDIAN NATIONAL CONGRESS|25806|58692
VARUNA|YATHINDRA S|INDIAN NATIONAL CONGRESS|96435|T BASAVARAJU|BHARATIYA JANATA PARTY|37819|58616
KUNDAPURA|HALADY SRINIVAS SHETTY|BHARATIYA JANATA PARTY|103434|RAKESH MALLI|INDIAN NATIONAL CONGRESS|47029|56405
MADDUR|D.C.THAMMANNA|JANATA DAL (SECULAR)|109239|MADHU G MADEGOWDA|INDIAN NATIONAL CONGRESS|55209|54030
MALLESHWARAM|DR. ASHWATH NARAYAN.C.N.|BHARATIYA JANATA PARTY|83130|KENGAL SHREEPADHARENU|INDIAN NATIONAL CONGRESS|29130|54000
SARVAGNANAGAR|K.J GEORGE|INDIAN NATIONAL CONGRESS|109955|M.N.REDDY|BHARATIYA JANATA PARTY|56651|53304
SHRAVANABELAGOLA|C N BALAKRISHNA|JANATA DAL (SECULAR)|105516|C S PUTTEGOWDA|INDIAN NATIONAL CONGRESS|52504|53012
BELGAUM RURAL|LAXMI R HEBBALKAR|INDIAN NATIONAL CONGRESS|102040|SANJAY B PATIL|BHARATIYA JANATA PARTY|50316|51724


#### Who won with least difference in votes?

CONSTITUENCY | WINNING CANDIDATE | WINNING PARTY | WINNER VOTES | RUNNER UP CANDIDATE | RUNNER UP PARTY | RUNNER UP VOTES | DIFFERENCE IN VOTES 
------------ | ------------- | ------------ | ------------- | ------------ | ------------- | ------------ | -------------
MASKI|PRATAPGOUDA PATIL|INDIAN NATIONAL CONGRESS|60387|BASANAGOWDA-TURVIHAL|BHARATIYA JANATA PARTY|60174|213
PAVAGADA|VENKATARAMANAPPA|INDIAN NATIONAL CONGRESS|72974|K M THIMMARAYAPPA|JANATA DAL (SECULAR)|72565|409
HIREKERUR|BASAVANAGOUDA PATIL|INDIAN NATIONAL CONGRESS|72461|UJANESHWARA BANAKAR|BHARATIYA JANATA PARTY|71906|555
KUNDGOL|CHANNABASAPPA SATHYAPPA SHIVALLI|INDIAN NATIONAL CONGRESS|64871|CHIKKANAGOUDRA SIDDANAGOUD ISHWARAGOD|BHARATIYA JANATA PARTY|64237|634
ALAND|GUTTEDAR SUBHASH RUKMAYYA|BHARATIYA JANATA PARTY|76815|B R PATIL|INDIAN NATIONAL CONGRESS|76118|697
YELLAPUR|ARABAIL HEBBAR SHIVARAM|INDIAN NATIONAL CONGRESS|66290|ANDALAGI VEERABHADRAGOUDA SHIVANAGOUDA PATIL|BHARATIYA JANATA PARTY|64807|1483
SINDHANUR|VENKATRAO NADAGOUDA|JANATA DAL (SECULAR)|71514|BADARLI HAMPANGOUDA|INDIAN NATIONAL CONGRESS|69917|1597
BADAMI|SIDDARAMAIAH|INDIAN NATIONAL CONGRESS|67599|B SREERAMULU|BHARATIYA JANATA PARTY|65903|1696
KRISHNARAJANAGARA|SA. RA. MAHESH|JANATA DAL (SECULAR)|85011|D. RAVISHANKAR|INDIAN NATIONAL CONGRESS|83232|1779
GADAG|HANAMANTAGOUDA KRISHNAGOUDA PATIL|INDIAN NATIONAL CONGRESS|77699|ANIL MENSINAKAI|BHARATIYA JANATA PARTY|75831|1868


213 votes. Did you see that? Yes, your vote does matter!

#### Which constituency had maximum number of candidates?

CONSTITUENCY | NO. OF CANDIDATES
------------ | -------------
MULBAGAL|40
HEBBAL|29
BELLARY CITY|29
RAICHUR|28
CHICKPET|28
HUBLI-DHARWAD CENTRAL|27
VARUNA|24
CHINTAMANI|23
K.R.PURA|22
KOLAR|22


#### Cost Analysis
EC allowed up to INR [16 Lakhs](http://eci.nic.in/eci_main1/Contesting.aspx) for election expenditure. Assuming that every candidate spent exactly 16 lakhs, we see some interesting results. Cost per seat excludes parties that won no seats.

##### Cost per vote.
Amount spent per vote.

###### Best Performers.
PARTY | TOTAL COST | VOTES PARTY GOT | COST PER VOTE
------------ | ------------- | ------------ | -------------
INDIAN NATIONAL CONGRESS|345600000|13611928|25.3895
BHARATIYA JANATA PARTY|353600000|13090424|27.0121
JANATA DAL (SECULAR)|318400000|6666240|47.7631
BHARATIYA PRAJA PAKSHA|6400000|83071|77.0425
SOCIAL DEMOCRATIC PARTY OF INDIA|4800000|45781|104.8470


###### Worst Performers.
PARTY | TOTAL COST | VOTES PARTY GOT | COST PER VOTE
------------ | ------------- | ------------ | -------------
JAI VIJAYA BHARATHI PARTY|1600000|96|16666.6667
KARUNAADU PARTY|4800000|289|16608.9965
GAREEB AADMI PARTY|1600000|102|15686.2745
ALL INDIA HINDUSTAN CONGRESS PARTY|1600000|108|14814.8148
SHRAMAJEEVI PARTY|1600000|115|13913.0435


##### Cost per seat.
Amount spent per seat.

PARTY | TOTAL COST | SEATS PARTY WON | SEATS PARTY PARTICIPATED | SUCCESS RATIO | COST PER SEAT
------------ | ------------- | ------------ | ------------- | ------------ | -------------
BHARATIYA JANATA PARTY|353600000|104|221|0.4706|3400000.0000
INDIAN NATIONAL CONGRESS|345600000|77|216|0.3565|4488311.6883
JANATA DAL (SECULAR)|318400000|37|199|0.1859|8605405.4054
BAHUJAN SAMAJ PARTY|27200000|1|17|0.0588|27200000.0000
KARNATAKA PRAGNYAVANTHA JANATHA PARTY|48000000|1|30|0.0333|48000000.0000


#### Candidates participating in multiple seats

A total of 3 Candidates contested from 2 constituencies, however only 4 won the seats.

CANDIDATE | PARTY | CONSTITUENCY | VOTES
------------ | ------------- | ------------ | ------------- 
SHANKAR JADHAV|BHARATIYA PEOPLES PARTY|GULBARGA RURAL|431
SHANKAR JADHAV|BHARATIYA PEOPLES PARTY|CHINCHOLI|149
SIDDARAMAIAH|INDIAN NATIONAL CONGRESS|BADAMI|67599
SIDDARAMAIAH|INDIAN NATIONAL CONGRESS|CHAMUNDESHWARI|85283
SRINIVASA|ALL INDIA MAHILA EMPOWERMENT PARTY|BANGARAPET|312
SRINIVASA|ALL INDIA MAHILA EMPOWERMENT PARTY|T.NARASIPUR|283


A string match of Names and Party were done. This is not fool proof. There could be 2 individuals with same name and belonging to the same party.

#### How the single largest party could have crossed the halfway mark?
They needed 10777 votes in total in the below constituencies.

CONSTITUENCY | WINNING CANDIDATE | WINNING PARTY | WINNER VOTES | RUNNER UP CANDIDATE | RUNNER UP VOTES | DIFFERENCE IN VOTES 
------------ | ------------- | ------------ | ------------- | ------------ | ------------- | ------------
MASKI|PRATAPGOUDA PATIL|INDIAN NATIONAL CONGRESS|60387|BASANAGOWDA-TURVIHAL|60174|213
HIREKERUR|BASAVANAGOUDA PATIL|INDIAN NATIONAL CONGRESS|72461|UJANESHWARA BANAKAR|71906|555
KUNDGOL|CHANNABASAPPA SATHYAPPA SHIVALLI|INDIAN NATIONAL CONGRESS|64871|CHIKKANAGOUDRA SIDDANAGOUD ISHWARAGOD|64237|634
YELLAPUR|ARABAIL HEBBAR SHIVARAM|INDIAN NATIONAL CONGRESS|66290|ANDALAGI VEERABHADRAGOUDA SHIVANAGOUDA PATIL|64807|1483
BADAMI|SIDDARAMAIAH|INDIAN NATIONAL CONGRESS|67599|B SREERAMULU|65903|1696
GADAG|HANAMANTAGOUDA KRISHNAGOUDA PATIL|INDIAN NATIONAL CONGRESS|77699|ANIL MENSINAKAI|75831|1868
SRINGERI|T D RAJEGOWDA|INDIAN NATIONAL CONGRESS|62780|D N JEEVARAJ|60791|1989
ATHANI|MAHESH IRANAGOUDA KUMATHALLI|INDIAN NATIONAL CONGRESS|82094|LAXMAN SANGAPPA SAVADI|79763|2331


**Disclaimer:** This is done just for fun. I will not take any responsibility if there is an error in the results due to a bad SQL.