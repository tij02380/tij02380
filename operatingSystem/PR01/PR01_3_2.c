#include <avr/io.h>
#include <avr/interrupt.h>
#include <util/delay.h>

unsigned char digit[10] = {0x3f, 0x06, 0x5b, 0x4f, 0x66, 0x6d, 0x7c, 0x07, 0x7f, 0x67};
unsigned char fnd_sel[4] = {0x01, 0x02, 0x04, 0x08};
unsigned char fnd[4];
unsigned int count = 0;
unsigned int i=0, min=0, sec=0;

void Time_set();
void Clock_set();

int main(void)
{
   DDRC = 0xff;
   DDRG = 0x0f;
   
   while(1)
   {
      Time_set();
   }
   
}

void Time_set()
{
   count++;
   
   if(count == 500)
   {
      count = 0;
      sec++;
      
      if(sec == 60)
      {
         min++;
         sec = 0;
      }
      
      if(min == 60)
      {
         min = 0;
      }
      
      fnd[3] = (min/10);
      fnd[2] = min%10;
      fnd[1] = (sec/10);
      fnd[0] = sec%10;
      for(i = 0; i<1950; i++)
         Clock_set();
      
   }
}

void Clock_set()
{
   PORTC = digit[fnd[3]];
   PORTG = fnd_sel[3];
   _delay_ms(2);
   PORTC = digit[fnd[2]];
   PORTG = fnd_sel[2];
   _delay_ms(2);
   PORTC = digit[fnd[1]];
   PORTG = fnd_sel[1];
   _delay_ms(2);
   PORTC = digit[fnd[0]];
   PORTG = fnd_sel[0];
   _delay_ms(2);
}