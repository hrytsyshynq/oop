### Програма, яка дозволяє вибрати один із двох способів оплати, слідкує за змінами вартості товару та здійснює додавання та видалення товарів з кошика. Реалізована із використанням використання трьох патернів проектування - Strategy, Observer та Command.

- У програмі ми використовуємо дві реалізації платіжної стратегії - CreditCardStrategy та PayPalStrategy. Кожен клас
  реалізує інтерфейс PaymentStrategy, який містить метод pay(), що приймає суму платежу. У методі pay() кожна з
  реалізацій виводить повідомлення про здійснення платежу.

- У програмі ми використовуємо клас Product як наглядача, який відстежує зміни вартості товару. Кожен об'єкт Product
  може мати декілька спостерігачів, які підписуються на оновлення. Клас PriceObserver реалізує інтерфейс Observer і
  використовується для відображення змін вартості товару.

- У програмі ми використовуємо класи AddToCartCommand та RemoveFromCartCommand як команди, що виконують дії додавання і
  видалення товарів з кошика. Кожна команда реалізує інтерфейс Command, який містить метод execute(). Клас ShoppingCart
  відповідає за виконання команд, які зберігаються в його списку команд commands.