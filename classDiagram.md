
Діаграма класів для LibraryMicroservice
Модифікатори доступу учасників

◆ Приватний (-)

◆ Публічний (+)

◆ Захищений (#)

◆ Пакет (~)

◆ Статичний (підкреслений)

<div>
    <ul>
        <li>Асоціація (є посилання, але нема залежності від внутрішньої реалізації) --></li>
        <li>Агрегація (об'єднання незалежних класів) o--</li>
        <li>Композиція (об'єднання залежних класів) *--</li>
        <li>Успадкування (extends) --|></li>
        <li>Реалізація (implements) ..|></li>
        <li>Залежність (внутрішня реалізація об'єкта впливає на класс) ..></li>
    </ul>
</div>

```mermaid
classDiagram
    class LibraryController{
        -service: LibraryService
        +getAllBooks()
    }

    class LibraryService{
        -repository: LibraryRepository
        +getAllBooks()
    }

    class LibraryRepository{
        +getAllBooks()
    }

    class LibraryEntity{
        -id: Long
        -books: BookEntity[]
    }
    
    class BookEntity{
        -id: Long
        -name: String
        -author: AuthorEntity
    }
    
    class AuthorEntity {
        -id: Long
        -name: String
        -books: BookEntity[]
    }

%% ===== (RELATIONS) =====
%%LibraryController "1" --> "1" LibraryService
LibraryController --> LibraryService
LibraryService --> LibraryRepository
LibraryRepository ..> LibraryEntity
LibraryEntity o--> BookEntity
BookEntity *--* AuthorEntity
%%AuthorEntity *--> BookEntity
```