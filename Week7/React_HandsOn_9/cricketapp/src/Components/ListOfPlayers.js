import React from 'react';

function ListofPlayers({ players }) {
  return (
    <ul>
      {players.map((item, idx) => (
        <li key={idx}>Mr. {item.name} <span>{item.score}</span></li>
      ))}
    </ul>
  );
}

export default ListofPlayers;
