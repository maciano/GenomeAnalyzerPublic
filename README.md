# GenomeAnalyzer
Given the parents and the child. I want to measure the percentage of mutations in the SNPs(Single-nucleotide_polymorphism) genotypes. Then compare these mutated SNPs with SNPedia DB to identify risky mutations and % of mutation improvement.
i.e:

<table>
  <tr>
    <td>Persona</td>
    <td>SNP</td>		
    <td>Genotype</td>
  </tr>
  <tr>
    <td>Father</td>
    <td>Rs7903146</td>		
    <td>CT</td>
  </tr>
  <tr>
    <td>Mother</td>
    <td>Rs7903146</td>		
    <td>CT<</td>
  </tr>
    <tr>
    <td>Child</td>
    <td>Rs7903146</td>		
    <td>TT<</td>
  </tr>
</table>

Rs7903146 = "TT" <br>
Magnitude = 3.5<br>
Frecuency=10.6%<br>
Repute=Bad: 2x increased risk for Type-2 diabetes- <br>
References=286<br>

http://www.snpedia.com/index.php/Rs7903146

http://chart.apis.google.com/chart?cht=bhs&chd=t:54.9,94.9,93.8,51.7,41.1,94.9,92.7,51.5,52.7,55.2,49.4,43.1,64.658333333333|34.5,5.1,5.3,42.9,50.0,5.1,7.3,41.6,39.1,37.9,40.4,41.2,29.2|10.6,0.0,0.9,5.4,8.9,0.0,0.0,6.9,8.2,6.9,10.3,15.7,6.15&chs=275x228&chbh=8,5&chxl=0:|1:|AVG|TSI|MKK|MEX|LWK|GIH|CHD|CHB|ASW|YRI|JPT|HCB|CEU||&chxt=x,y&chco=CD853F,30FF30,0000FF,FF00FF&chls=1,1,0|1,1,0|1,1,0|1,1,0

Stats:
Chromosome:1 0.72982454 simil
Execution Time:1114ms - Reading and comparing with BufferedReader 1 Chromosome.

Input format (\t separated file):
<table>
  <tr>
    <p># rsid	chromosome	position	genotype
rs12564807	1	734462	AG
rs3131972	1	752721	GA
rs148828841	1	760998	TC
rs12124819	1	776546	AA
</p>

