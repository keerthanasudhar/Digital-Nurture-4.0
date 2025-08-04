import React from 'react';
import ListofPlayers from './components/ListOfPlayers';
import Scorebelow70 from './components/Scorebelow70';
import ListofIndianPlayers from './components/ListOfIndianPlayers';
import { OddPlayers, EvenPlayers } from './components/OddEvenPlayers';

const players = [
  { name: 'Virat', score: 85 },
  { name: 'Rohit', score: 45 },
  { name: 'Dhoni', score: 90 },
  { name: 'Rahul', score: 66 },
  { name: 'Pant', score: 35 },
  { name: 'Bumrah', score: 78 },
  { name: 'Shami', score: 69 },
  { name: 'Jadeja', score: 55 },
  { name: 'Ashwin', score: 73 },
  { name: 'Surya', score: 95 },
  { name: 'Gill', score: 82 }
];

const T20Players = ['First Player', 'Second Player', 'Third Player'];
const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];
const IndianTeam = IndianPlayers;

const flag = false;

function App() {
  return (
    <div className="App">
      {flag === true ? (
        <div>
          <h1>List of Players</h1>
          <ListofPlayers players={players} />
          <hr />
          <h1>List of Players having Scores Less than 70</h1>
          <Scorebelow70 players={players} />
        </div>
      ) : (
        <div>
          <div>
            <h1>Indian Team</h1>
            <h1>Odd Players</h1>
            {OddPlayers(IndianTeam)}
            <h1>Even Players</h1>
            {EvenPlayers(IndianTeam)}
          </div>
          <hr />
          <div>
            <h1>List of Indian Players Merged:</h1>
            <ListofIndianPlayers IndianPlayers={IndianPlayers} />
          </div>
        </div>
      )}
    </div>
  );
}

export default App;
