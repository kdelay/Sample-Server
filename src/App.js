import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Sample from './Sample';

function App() {
  return (
    <Router>
      <Switch>
        <Route exact path='/' component={Sample} />
      </Switch>
    </Router>
  );
}

export default App;
